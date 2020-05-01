package com.github.johnsonadeshina.blogPost;

import java.util.ArrayList;
import java.util.List;

public class Blogging extends BlogPost{

    public ArrayList<BlogPost> allBlogPosts = new ArrayList<BlogPost>();

    public void addBlogPosts (ArrayList<BlogPost> blogPosts) {
        for(int i = 0; i < blogPosts.size(); i++) {
            allBlogPosts.add(blogPosts.get(i));
        }
    }

    public void displayAllBlogs() {
        for (int i = 0; i < allBlogPosts.size(); i++) {
            System.out.println(allBlogPosts.get(i));
        }
    }

    public BlogPost get(int i) {
        if (i >= allBlogPosts.size() || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return allBlogPosts.get(i);
    }


}
