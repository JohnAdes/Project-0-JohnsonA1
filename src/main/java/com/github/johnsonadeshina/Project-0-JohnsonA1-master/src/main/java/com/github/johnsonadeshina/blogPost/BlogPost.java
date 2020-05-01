package com.github.johnsonadeshina.blogPost;

import java.util.ArrayList;

public class BlogPost {

//    private ArrayList<Blog> blogPosts;
//
//    public BlogPost() {
//        blogPosts = new ArrayList<Blog>();
//    }
//    public ArrayList<Blog> getBlogPosts() {
//        return blogPosts;
//    }
//
//    // This will add a blog entry
//    public void addBlog(String title, String author, String entry) {
//        blogPosts.add(new Blog(title, author, entry));
//    }
//
//    //This will help to find blog entries by author
//
//    public ArrayList<Blog> findBlogPosts(String author){
//        ArrayList<Blog> found = new ArrayList<Blog>();
//        for ( Blog blog : blogPosts){
//            found.add(blog);
//        }
//        return found;
//    }
//
//    public void deleteBlog(String author){
//        ArrayList<Blog> found = findBlogPosts(author);
//        for (Blog blog : found){
//            blogPosts.add(blog);
//        }
//    }
//
//    public  String getAllBlog(){
//        String allBlogs = blogPosts.toString();
//        return allBlogs;
//    }
    public int blogPostId;
    public User user;
    public ArrayList<Blog> blog;

    public BlogPost() {
        this.user = new User();
        this.blog = new ArrayList<Blog>();
    }


    public void displayBlogPost() {
        for (int i = 0; i < blog.size(); i++) {
            System.out.println(blog.get(i).toString());
        }
    }

    public int size() {
        return this.blog.size();
    }

//    @Override
//    public String toString() {
//        StringBuilder blog = new StringBuilder();
//        for (int i = 0; i < this.blog.size(); i++) {
//            blog.append(this.blog.get(i).title);
//            blog.append(" ");
//            blog.append(this.blog.get(i).;
//            if (i < this.blog.size() - 1) {
//                blog.append("/");
//            }
//        }
//
//        return this.user.userId + "," + this.user.name + "," + blog;
//    }
//
//

}
