package com.codeup.blogapp;


import com.codeup.blogapp.Post;
import com.codeup.blogapp.PostsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/posts", headers="Accept=application/json")
        public class PostsController {

    private final PostsRepository postsRepository;

    public PostsController(PostsRepository postsRepository){
        this.postsRepository = postsRepository;
    }

    @GetMapping
    private List<Post> getPost() {
        return postsRepository.findAll();

    }

    @GetMapping("{id}")
    private Post getPostById(@PathVariable Long id) {
        return postsRepository.getById(id);
    }

    @PostMapping
    private void createPost(@RequestBody Post newPost){
        System.out.println(newPost.getTitle());
        System.out.println(newPost.getContent());
    }
    @PutMapping("/{id}")
    private void updatePost(@PathVariable Long id, @RequestBody Post post){
        System.out.println(id);
        System.out.println(post);
    }
    @DeleteMapping({"/{id}"})
    private void deletePost(@PathVariable Long id){
        System.out.println("id");
    }



}
