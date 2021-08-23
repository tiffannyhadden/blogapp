package com.codeup.blogapp;


import com.codeup.blogapp.Post;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "categories")
public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String name;
        @ManyToMany(mappedBy = "categories")
        @JsonManagedReference
        private Collection<Post>  posts;

        public Category(){}
        public Category(Long id, String name) {
            this.id = id;
            this.name = name;

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

