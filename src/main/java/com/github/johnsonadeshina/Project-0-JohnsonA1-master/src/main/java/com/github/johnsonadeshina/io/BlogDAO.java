package com.github.johnsonadeshina.io;


import com.github.johnsonadeshina.blogPost.Blog;
import com.github.johnsonadeshina.blogPost.BlogPost;

import java.util.ArrayList;
import java.util.List;

public interface BlogDAO<E> {



    void writeAll(List<Blog> blogPosts);

    List<E> readAll();
}
