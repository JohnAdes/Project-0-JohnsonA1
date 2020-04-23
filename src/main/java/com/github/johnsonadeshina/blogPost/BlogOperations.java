package com.github.johnsonadeshina.blogPost;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlogOperations{

    public ArrayList<Blog> blogPosts;

    public BlogOperations() {
        blogPosts = new ArrayList<Blog>();
    }

        public void addBlog (String title, String author, String blogEntry) {
         blogPosts.add(new Blog(title, author, blogEntry));
        }

        public ArrayList<Blog> searchBlogPosts(String author){
        ArrayList<Blog> exists = new ArrayList<Blog>();
            for (Blog blog: blogPosts ) {
                if ((blog.getAuthor().equalsIgnoreCase(author))) ;
            }
            return exists;
            }

        public void  deleteBlogPosts(String author) {
            ArrayList<Blog> exists = searchBlogPosts(author);
            for (Blog blog : exists) {
                blogPosts.remove(blog);
            }
        }

        public List<Blog> getAll(){
        return  blogPosts;
        }

}
