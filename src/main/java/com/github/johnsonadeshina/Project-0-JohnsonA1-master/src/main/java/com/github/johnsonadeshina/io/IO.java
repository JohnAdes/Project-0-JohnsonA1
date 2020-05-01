package com.github.johnsonadeshina.io;

import com.github.johnsonadeshina.blogPost.Blog;
import com.github.johnsonadeshina.blogPost.BlogPost;
import com.github.johnsonadeshina.blogPost.Blogging;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public Blogging storeBlog(BlogPost blogPost) {
        SQLOpsRepo blogRepo = new SQLOpsRepo();
        // insert into database
        blogRepo.writeAll((List<Blog>) blogPost);

        // update order history to match database
        Blogging blogHistory = new Blogging();
        blogHistory.addBlogPosts((ArrayList<BlogPost>) blogRepo.readAll());

        // delete old blogging.txt file
        File oldBlogging = new File("output.txt");
        oldBlogging.delete();

        // create new blogging.txt file
        File newBlogging = new File("output.txt");
        try {
            newBlogging.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // insert database data into .txt file
        PrintOpsRepo writer = new PrintOpsRepo(newBlogging);
        for (int i = 0; i < blogHistory.allBlogPosts.size(); i++) {
            writer.writeAll((List<Blog>) blogHistory.allBlogPosts.get(i));
        }
        return blogHistory;

    }
}
