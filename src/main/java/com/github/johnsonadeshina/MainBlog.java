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

            int id = 0;
            ++id;

            System.out.println("Please enter your Blog Title: or 'Quit' to exit the program");
            String title = in.nextLine();
            if(title.equalsIgnoreCase("Quit")) {
                break;
            }

            System.out.println("Please enter the Author:");
            String author = in.nextLine();

            System.out.println("Please enter your Blog Entry:");
//            in.next();
            String blogEntry = in.nextLine();

            //create log of blogposts
            Blog blog = new Blog(id, title, author, blogEntry);
            blogPost.add(blog);
            }
            in.close();

        System.out.println("S/No." + ".\t " + "Title" + ",\t " + "Author" + ",\t " + "Blog Entry" );
        System.out.println("==============================================");
        for(Blog blogs : blogPost){
            System.out.println(blogs.getId() + ",\t " + blogs.getTitle() + ",\t " + blogs.getAuthor() + ",\t " + blogs.getBlogEntry());

        }

    }


}
