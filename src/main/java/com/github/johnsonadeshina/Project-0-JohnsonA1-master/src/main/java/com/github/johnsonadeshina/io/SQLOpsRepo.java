package com.github.johnsonadeshina.io;


import com.github.johnsonadeshina.blogPost.Blog;
import com.github.johnsonadeshina.blogPost.BlogFactory;
import com.github.johnsonadeshina.blogPost.BlogPost;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLOpsRepo implements BlogDAO<BlogPost> {

    private SQLDataSource dataSource;
    private List<BlogPost> cache;
//    private BlogFactory BlogFactory;

    public SQLOpsRepo(SQLDataSource dataSource) {
        this.dataSource = dataSource;
        cache = new ArrayList<>();
    }

    public SQLOpsRepo() {

    }

    @Override
    public void writeAll(List<Blog> blogPosts) {
        String sql = "insert into operations(title, author, entry) values(?, ?, ?)";
        try (Connection connection = this.dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);) {
            for (Blog blog : blogPosts) {
                statement.setString(1, blog.getTitle());
                statement.setString(2, blog.getAuthor());
                statement.setString(3, blog.getBlogEntry());
                statement.addBatch();
            statement.executeBatch();}
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public List<BlogPost> readAll() {
        if (cache.isEmpty()) {
            BlogFactory factory = BlogFactory.getInstance();
            String sql = "select * from blogs";

            try (Connection connection = this.dataSource.getConnection();
                 Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery(sql);) {
                while (rs.next()) {
                    Blog blog;
                    String title = rs.getString("title");
                    String author = rs.getString("author");
                    String blogEntry = rs.getString("entry");
                    blog = factory.getBlog(title, author, blogEntry);

                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }

        }
        return null;
    }

}
