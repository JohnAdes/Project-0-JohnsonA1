package com.github.johnsonadeshina.blogPost;

public class BlogFactory {

    private static BlogFactory instance;

    public BlogFactory() {
    }

    public static BlogFactory getInstance(){
        if (instance == null){
            instance = new BlogFactory();
        }
        return instance;
    }

    public Blog getBlog(String title, String author, String blogEntry){
        return  getBlog(title, author, blogEntry);
    }



}
