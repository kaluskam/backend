package com.example.page.controller;

import com.example.page.dao.UserRepository;
import com.example.page.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void addNewUser (@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
