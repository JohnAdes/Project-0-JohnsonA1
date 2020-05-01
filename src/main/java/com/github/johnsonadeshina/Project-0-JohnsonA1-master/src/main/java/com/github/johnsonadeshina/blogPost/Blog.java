package com.github.johnsonadeshina.blogPost;

import java.util.ArrayList;

public class Blog {
    private int id;
    private String title;
    private String author;
    private String blogEntry;

    public Blog() {
    }


    public Blog(int id, String title, String author, String blogEntry) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }

    @Override
    public String toString() {
        StringBuilder blogPost = new StringBuilder();
        blogPost.append(this.id);
        blogPost.append(",");
        blogPost.append(this.title);
        blogPost.append(",");
        blogPost.append(this.author);
        blogPost.append(",");
        blogPost.append(this.blogEntry);
        blogPost.append(",");

        return blogPost.toString();
    }

    public ArrayList<Blog> parseBlog(String s) {
        return null;
    }
}
