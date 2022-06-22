package com.example.library.controller;

import com.example.library.model.Color;
import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import com.example.library.service.UserService;
import com.example.library.service.serviseImpl.UserServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @Operation
    @PostMapping("/users")
    public User user(
            @RequestBody User user)
    {
        return userService.saveUser(user);
    }
    @GetMapping("/users")
    public List<User> getAllUser()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/byAge/{age}")
    public List<User> moreThanAge(@PathVariable int age)
    {
        return userService.moreThanAge(age);
    }

    @GetMapping("/moreThanThreeArticles")
    public List<String> moreThanThreeArticles(){
        List<String> users = userService.moreThanThreeArticles();
        return users;
    }

    @GetMapping("/byColor/{color}")
    public List<User> findUserByColor(@PathVariable String color){
        List<User> users = userService.findUserByColor(color);
        return users;
    }
}
