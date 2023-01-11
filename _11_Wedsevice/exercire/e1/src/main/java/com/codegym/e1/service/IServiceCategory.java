package com.codegym.e1.service;

import com.codegym.e1.model.CategoryBlog;

import java.util.List;

public interface IServiceCategory {
    List<CategoryBlog> findAll();

    CategoryBlog findById(Integer id);

    void create(CategoryBlog blog);

    void update(CategoryBlog blog);

    void deleteById(Integer id);
    List<CategoryBlog> findIDCategory(Integer id);
}
