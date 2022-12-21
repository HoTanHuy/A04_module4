package com.codegym.e1.service;

import com.codegym.e1.model.Blog;
import com.codegym.e1.model.User;

import java.util.List;

public interface eBlogService {
    List<Blog> findAll();
    List<Blog> findById(User user);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
