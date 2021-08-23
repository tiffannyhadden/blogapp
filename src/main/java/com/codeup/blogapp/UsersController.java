package com.codeup.blogapp;

import org.springframework.web.bind.annotation.*;
import com.codeup.blogapp.User;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/users", headers = "Accept=application/json")
public class UsersController {

    @GetMapping
    private List<User> getUsers() {
        return new ArrayList<>() {
            {
                add(new User(1L, "amadoIII", "amadoiii@gmail.com", "amado@III"));
                add(new User(1L, "richardL", "richardL@gmail.com", "RichardL"));
                add(new User(1L, "PrachiP", "prachiP@gmail.com", "PrachiP"));
            }
        };
    }


    @GetMapping("/{id}")
    private User getUserById(@PathVariable Long id) {
        // /api/posts/1
        if (id == 1) {
            return new User();
        } else {
            return null;
        }

    }

    @PostMapping
    private void createUser(@RequestBody User newUser) {
        System.out.println(newUser.getUsername());
    }

    @PutMapping("{id}")
    private void updateUser(PathVariable id, @RequestBody User user) {
        System.out.println(id);
    }

    @DeleteMapping("{id}")
    private void deleteUser(@PathVariable Long id) {
        System.out.println(id);
    }

    @GetMapping("/findByEmail")
    private User findByEmail(@RequestParam String email) {

        if (email.equals("tiffanny@codeup.com")) {
            return new User("Tiffanny");
        } else if (email.equals("prachi@codeup.com")) {
            return new User("prachi");
        } else
            return null;
    }

    @GetMapping("/findByUsername")
    private User findByUsername(@RequestParam String username) {

        if (username.equals("tiffanny")) {
            return new User("Tiffanny");
        } else if (username.equals("prachi")) {
            return new User("Prachi");
        } else
            return null;
    }

    @GetMapping("updatePassword")
    private void updatePassword(@PathVariable Long id, @RequestParam(required = false) String oldPassword, @Valid @Size(min = 3) @RequestParam String newPassword) {

    }




}

