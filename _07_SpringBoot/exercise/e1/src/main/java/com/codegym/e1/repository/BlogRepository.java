package com.codegym.e1.repository;

import com.codegym.e1.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

    @Query(value="select * from blog where title like %:keyword%", nativeQuery = true)
    List<Blog> searchList(@Param("keyword") String keyword);
}
