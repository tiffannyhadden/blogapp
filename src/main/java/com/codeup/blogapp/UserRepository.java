package com.codeup.blogapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<com.codeup.blogapp.data.User, Long>{


    com.codeup.blogapp.data.User findFirstByUsername(String username);

    com.codeup.blogapp.data.User findFirstByEmail(String email);
}
