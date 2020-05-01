package com.github.johnsonadeshina;

import com.github.johnsonadeshina.blogPost.Blog;
import com.github.johnsonadeshina.blogPost.BlogJournal;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBlog {

    public static void main (String[] args) {

        BlogJournal blogJournal = new BlogJournal();
        blogJournal.addBlog();
        blogJournal.printBlog();



    }


}
