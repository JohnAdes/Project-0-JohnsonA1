package com.github.johnsonadeshina.io;


import com.github.johnsonadeshina.blogPost.Blog;
import com.github.johnsonadeshina.blogPost.BlogFormat;
import com.github.johnsonadeshina.blogPost.BlogPost;
//import com.github.johnsonadeshina.blog.posting.BlogFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileOpsRepo implements BlogDAO<BlogPost> {

    private File fileName;
    
    public FileOpsRepo(File fileName) {
        this.fileName = fileName;
    }


    @Override
    public void writeAll(ArrayList<BlogPost> blogPost)  {
    }


    @Override
    public ArrayList<BlogPost> readAll() {

        ArrayList<String> messages = new ArrayList<>();
        BlogFormat blogFormat = new BlogFormat();

        try (FileReader in = new FileReader(this.fileName); BufferedReader reader = new BufferedReader(in);) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                messages.add(line);
                }
               reader.close();

        } catch (FileNotFoundException e) {
            System.err.println("input file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return blogFormat.ParseUserBlogPosts(messages);
    }






}
