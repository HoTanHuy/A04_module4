package com.codegym.e1.service.iml;

import com.codegym.e1.model.Blog;
import com.codegym.e1.repository.IRepositoryBlog;
import com.codegym.e1.service.IServiceBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBlog implements IServiceBlog {

    @Autowired
    private IRepositoryBlog repositoryBlog;

    @Override
    public List<Blog> findAll() {
        return repositoryBlog.findAll();
    }

    @Override
    public Blog findById(Integer id) {
        return repositoryBlog.findById(id).orElse(null);
    }

    @Override
    public void create(Blog blog) {
        repositoryBlog.save(blog);
    }

    @Override
    public void update(Blog blog) {
        repositoryBlog.save(blog);
    }

    @Override
    public void deleteById(Integer id) {
        repositoryBlog.deleteById(id);
    }

    @Override
    public List<Blog> listQueryCategory(Integer id) {

        return repositoryBlog.findAllByCategoryBlog_IdCategory(id);
    }

    @Override
    public List<Blog> search(String name) {
        return repositoryBlog.findByNameContaining(name);
    }
}
