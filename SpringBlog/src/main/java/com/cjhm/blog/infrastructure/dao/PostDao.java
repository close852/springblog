package com.cjhm.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjhm.blog.domain.doel.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer>{

}
