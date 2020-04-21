package com.github.johnsonadeshina.blogPost;

public class Blog {

//    protected int id;
    protected String title;
    protected String author;
    protected String blogEntry;

    public Blog() {
    }


    public Blog( String title, String author, String blogEntry) {
//        this.id = id;
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
    }




//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }

    @Override
    public String toString() {
        return "Blog{" +
//                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", blogEntry='" + getBlogEntry() + '\'' +
                '}';
    }
}
