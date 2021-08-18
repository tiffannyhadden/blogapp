package com.codeup.blogapp.web;


import com.codeup.blogapp.data.Post;
import com.codeup.blogapp.data.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/posts", headers="Accept=application/json")
        public class PostsController {

    @GetMapping
    private List<Post> getPosts(){
        User user = new User("Bob");
        return new ArrayList<Post>(){{
            add(new Post(1L, "A new Post",
                    "This is a brilliant post. 10/10", user));
            add(new Post(2L, "A newer Post",
                    "This is a slightly more brilliant post. 11/10", user));
            add(new Post(3L, "A newest Post",
                    "This is the best post. 12/10", user));
        }};

    }

    @GetMapping({"{id}"})
    private Post getPostById(@PathVariable Long id){
        User user = new User("Bob");
        // /api/posts/1
        if (id == 1){
        return new Post(1L, "A new Post",
                "this is a brilliant post. 10/10", user);
    }else{
        return null;
    }
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
