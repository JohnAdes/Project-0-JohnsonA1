package com.github.johnsonadeshina;

import com.github.johnsonadeshina.blogPost.Blog;
import com.github.johnsonadeshina.blogPost.BlogJournal;
import com.github.johnsonadeshina.io.FileParser;

import java.util.Scanner;

public class MainBlog {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // BlogJournal instance
        BlogJournal blogJournal = new BlogJournal();
        int option = 0;
        // main loop
        while (option != 4) {
            System.out.println ("Welcome to your Blog");
            blogJournal.printBlogPosts();
            System.out.println();
            System.out.println("Choose an action:");
            System.out.println("1 - Add an entry");
            System.out.println("2 - Search for entries");
            System.out.println("3 - Delete entries");
            System.out.println("4 - End");
            option = scanner.nextInt();
            System.out.println();
            // reaction to the choice
            switch (option) {
                case 1:
                    blogJournal.addBlog();
                   break;
                case 2:
                    blogJournal.searchBlogPosts();
                    break;
                case 3:
                    blogJournal.deleteBlogPosts();
                    break;
                case 4:
                    FileParser fileParser = new FileParser();
                    fileParser.writeABlog(blogJournal);
                break;
                case 5:
                    System.out.println("Press any key to quit the program...");
                    break;
                default:
                    System.out.println("Error. Press any key to choose another action.");
                    break;
            }
        }
    }

}