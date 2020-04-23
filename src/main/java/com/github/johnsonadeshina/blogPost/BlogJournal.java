package com.github.johnsonadeshina.blogPost;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlogJournal {

    public BlogOperations blogOperations;
    public ArrayList<Blog> blogPosts = new ArrayList<Blog>();

    private Scanner in = new Scanner(System.in);

    public BlogJournal() {
        blogOperations = new BlogOperations();
    }

    public void printBlogPosts() {
//        ArrayList<Blog> blogPosts = new ArrayList<Blog>();
        for (Blog blog : blogPosts) {

            System.out.println(blog);
        }
    }

    public void addBlog(){
        System.out.println("Please enter your Blog Title:");
        String title = in.nextLine();
        System.out.println("Please enter the Author:");
        String author = in.nextLine();
        System.out.println("Please enter your Blog Entry:");
        String blogEntry = in.nextLine();
        blogPosts.add(new Blog(title, author, blogEntry));





    }

    public void searchBlogPosts() {
        // Searching for Blog posts
        String author = "";
        ArrayList<Blog> blogPosts = blogOperations.searchBlogPosts(author);
        // Printing entries
        if (blogPosts.size() > 0) {
            System.out.println("Blog posts exist: ");
            for (Blog blog :blogPosts) {
                System.out.println(blog);
            }
        } else {
            // Nothing found
            System.out.println("No blog posts existed.");
        }
//        scanner.nextLine(); // wait for enter
    }

    public void deleteBlogPosts() {
        System.out.println("Entries with the same exact date and time will be deleted");
        String author = "";
        blogOperations.deleteBlogPosts(author);
    }

    public List<Blog> getAll(){

        return  blogPosts;
    }


}
