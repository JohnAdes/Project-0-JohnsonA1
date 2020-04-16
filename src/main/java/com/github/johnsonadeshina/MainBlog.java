package com.github.johnsonadeshina;

import com.github.johnsonadeshina.blogPost.Blog;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBlog {

    public static void main (String[] args) {
        ArrayList<Blog> blogPost = new ArrayList<Blog>();
        Scanner in = new Scanner(System.in);
        boolean readyToBlog = true;

        while(readyToBlog){
            System.out.println("Please enter your Blog Title: or 'Quit' to exit the program");
            String title = in.next();
            if(title.equalsIgnoreCase("Quit")) {
                break;
            }

            System.out.println("Please enter the Author:");
            String author = in.next();

            System.out.println("Please enter your Blog Entry:");
//            in.next();
            String blogEntry = in.next();


            //create log of blogposts
            Blog blog = new Blog(title, author, blogEntry);
            blogPost.add(blog);
        }
        in.close();

        for(Blog blogs : blogPost){
            System.out.println(blogs.getTitle() + ",\t " + blogs.getAuthor() + ",\t " + blogs.getBlogEntry());
            System.out.println();
        }

    }


}
