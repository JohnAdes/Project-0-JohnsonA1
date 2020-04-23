package com.github.johnsonadeshina.io;

import com.github.johnsonadeshina.blogPost.Blog;
import com.github.johnsonadeshina.blogPost.BlogJournal;
import com.github.johnsonadeshina.blogPost.BlogOperations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    static final File fInput = new File("input.csv");
    static final File fOutput = new File("output.csv");

    public void writeABlog(BlogJournal blogJournal) {

        try { FileWriter fileWriter = new FileWriter(fOutput, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

//            FileWriter fileWriter = new FileWriter(blog);
//            fileWriter.write("");
//            fileWriter.write(blogJournal.blogPosts.get(0).getTitle());
//            fileWriter.write(blogJournal.blogPosts.get(0).getAuthor());
//            fileWriter.write(blogJournal.blogPosts.get(0).getBlogEntry());
//
//          fileWriter.close();
//            printWriter.println("blogOperations");

    }

    private List<BlogJournal> read(){

        List<BlogJournal> result = new ArrayList<BlogJournal>();

        try { FileReader in = new FileReader(fInput);
            BufferedReader bufferedReader = new BufferedReader(in);
            String line = bufferedReader.readLine();
            while (line != null){
//                ArrayList<Blog> blogs =line.split(",");
            }

        }catch (FileNotFoundException e){
            e.fillInStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
