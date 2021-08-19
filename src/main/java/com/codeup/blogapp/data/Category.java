package com.codeup.blogapp.data;



    public class Category {
        private Long id;
        private String name;
        private Post post;


        public Category(Long id, String name, Post post) {
            this.id = id;
            this.name = name;
            this.post = post;
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

