package com.github.johnsonadeshina.blogPost;

import java.util.ArrayList;

public class BlogFormat {

    public String firstLetterToUpperCase(String stringBuffer) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(stringBuffer.charAt(0)));
        sb.append(stringBuffer.substring(1).toLowerCase());
        return sb.toString();
    }

    public BlogPost parseBlogPost(String rawBlogPost) {
        BlogPost blogPost = new BlogPost();

        // take raw string data parse and format
        String[] buffer = rawBlogPost.split(",");

        // add user name to user blog from file - formatted
        blogPost.user.name = firstLetterToUpperCase(buffer[0]);

        // take user blog parse, format, and add to user blog
        blogPost.blog = new Blog().parseBlog(buffer[1]);

        return blogPost;
    }


        public ArrayList<BlogPost> ParseUserBlogPosts (ArrayList < String > messages) {
            ArrayList<BlogPost> blogPosts = new ArrayList<BlogPost>();

            for (int i = 0; i < messages.size(); i++) {
                blogPosts.add(parseBlogPost(messages.get(i)));
            }

            return blogPosts;
        }

}
