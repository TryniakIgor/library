package com.example.library.controller;

import DTO.UserDTO;
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
    public UserDTO save(
            @RequestBody UserDTO userDTO)
    {
        return userService.saveUser(userDTO);
    }

    @GetMapping("/users")
    public List<UserDTO> getAllUser()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/byAge/{age}")
    public List<UserDTO> moreThanAge(@PathVariable int age)
    {
        return userService.moreThanAge(age);
    }

    @GetMapping("/moreThanThreeArticles")
    public List<String> moreThanThreeArticles(){
        List<String> users = userService.moreThanThreeArticles();
        return users;
    }

    @GetMapping("/byColor/{color}")
    public List<UserDTO> findUserByColor(@PathVariable String color){
        List<UserDTO> users = userService.findUserByColor(color);
        return users;
    }
}
