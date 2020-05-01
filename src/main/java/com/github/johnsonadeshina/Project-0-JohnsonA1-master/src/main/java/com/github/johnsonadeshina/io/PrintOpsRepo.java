package com.github.johnsonadeshina.io;

//import com.github.johnsonadeshina.blog.posting.BlogFactory;

import com.github.johnsonadeshina.blogPost.BlogPost;


import java.io.*;
import java.util.ArrayList;

public class PrintOpsRepo implements BlogDAO<BlogPost>{

    private File fileName;

    public PrintOpsRepo(File fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeAll(ArrayList<BlogPost> blogPost){
        // Print to file
        try (FileWriter fw = new FileWriter(this.fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw);) {

            pw.println(blogPost.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<BlogPost> readAll(){
        return null;
    }
}
