package com.codeup.blogapp;

import com.codeup.blogapp.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Post, Long> {

}