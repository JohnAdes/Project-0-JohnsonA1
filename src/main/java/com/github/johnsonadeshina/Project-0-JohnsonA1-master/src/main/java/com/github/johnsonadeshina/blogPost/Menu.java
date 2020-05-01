package com.github.johnsonadeshina.blogPost;


import com.github.johnsonadeshina.blog.server.HttpServer;
import com.github.johnsonadeshina.io.BlogDAO;
import com.github.johnsonadeshina.io.FileOpsRepo;
import com.github.johnsonadeshina.io.SQLDataSource;
import com.github.johnsonadeshina.io.SQLOpsRepo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu(){

    }
    ArrayList<Blog> blogPosts = new ArrayList<>();
//    FileOpsRepo fileOpsRepo = new FileOpsRepo(f);
//    BlogJournal blogJournal = new BlogJournal();
    int option = 0;
    String fInput = "";
    int id = 1;
    boolean readyToBlog = true;
    Scanner in = new Scanner(System.in);
 // method to take input from the user

    public String fileInput(){
        System.out.println("please enter the of the file you want to write to:");
        fInput= in.nextLine();
        return fInput;
    }


    public  void userInputForBlogEntry() {

        boolean readyToBlog = true;
        while (readyToBlog) {
            System.out.println("Please enter your Blog Title: or 'Quit' to exit the program");
            String title = in.nextLine();
            if (title.equalsIgnoreCase("Quit")) {
                break;
            }

            System.out.println("Please enter the Author:");
            String author = in.nextLine();

            System.out.println("Please enter your Blog Entry:");
            String blogEntry = in.nextLine();

            //create log of blogposts
            Blog blog = new Blog(id, title, author, blogEntry);
            id++;
            blogPosts.add(blog);

        }
    }
//            }


    public void printToConsole() {
        System.out.println("S/No." + ".\t " + "Title" + ",\t " + "Author" + ",\t " + "Blog Entry");
        System.out.println("==============================================");
        for (Blog blogs : blogPosts) {
            System.out.println(blogs.getId() + ",\t " + blogs.getTitle() + ",\t " + blogs.getAuthor() + ",\t " + blogs.getBlogEntry());

        }
    }
//    static private void mode_2()
//    {
//        System.out.println("*** Mode #2 ***");
//        System.out.print("Please enter names of input file and [Option] output file: ");
//        List<Blog> blogs=read_write();
//
//    }

//    private static List<Blog> read_write() {
//        List<Blog> blogs=new ArrayList<>();
//        BufferedReader reader;
//        Scanner sc=new Scanner(System.in);
//        String input_filename[]=(sc.nextLine()).split(" ");
//        try{
//            reader=new BufferedReader(new FileReader(input_filename[0]));
//            String line=reader.readLine();
//            Blog temp;
//            while(line!=null)
//            {
////                temp=search(line);
//                if(input_filename.length==2)
//                {
//                    writeToFile(input_filename[1], temp.toString());
//                }
//                else if(input_filename.length==1)
//                {
//                    System.out.println(temp);
//                }
//                blogs.add(temp);//
//                line=reader.readLine();
//            }
//            reader.close();
//        }
//        catch(IOException e)
//        {
//            System.out.println(input_filename[0]+ " No such file exit!");
//
//        }
//        return blogs;
//    }

    private static void writeToFile(String fn, String blog) {
        File file_name=new File(fn);
        FileWriter file_w=null;
        BufferedWriter buff_w=null;
        try{
            file_w=new FileWriter(file_name,true);
            buff_w=new BufferedWriter(file_w);
            buff_w.write(blog);
        }
        catch(IOException e)
        {
            System.out.println("IOException!!!");
        }
        finally{
            try{
                buff_w.close();
                file_w.close();
            }
            catch(IOException e)
            {
                System.out.println("IOExecption!!");
            }
        }
    }

    public void fileInputs () {
                fileInput();
                File input = new File(fInput);
                BlogDAO<BlogPost> fileParser = new FileOpsRepo(input);
                ArrayList<BlogPost> blogPosts = new FileOpsRepo(new File(fInput)).readAll();
                // Loop through all blog posts loaded from input file
                for (BlogPost blog : blogPosts) {
                    blog.displayBlogPost();
                }

                SQLDataSource dataSource = SQLDataSource.getInstance();
                SQLOpsRepo blogRepo = new SQLOpsRepo();

//                List<BlogPost> blogPosts = blogRepo.readAll();
                for (BlogPost blog : blogPosts) {
                    System.out.println(blog);
                }
            }

    static private void writeDB(List<Blog> blogs)
    {
//                ArrayList<BlogPost> blogPosts = fileOpsRepo.readAll();
                SQLDataSource dataSource = SQLDataSource.getInstance();
                SQLOpsRepo blogRepo = new SQLOpsRepo(dataSource);
                blogRepo.writeAll(blogs);
            }
            public void readDB ()
            {
                SQLDataSource dataSource = SQLDataSource.getInstance();
                SQLOpsRepo blogRepo = new SQLOpsRepo();

                ArrayList<BlogPost> blogList = (ArrayList<BlogPost>) blogRepo.readAll();
                for (BlogPost blog : blogList) {
                    System.out.println(blog);
                }
            }

    

            public void httpServer () {

                HttpServer server = new HttpServer();
                System.out.println("Running http server on port 8080");
                server.listen();
            }



    }