package com.example.library.service;

import com.example.library.model.Article;
import com.example.library.model.Color;
import com.example.library.model.User;

import java.util.List;

public interface UserService {
    User saveUser (User user);
    List<User> getAllUsers();
    List<User> moreThanAge (int age);
   // List<User> findUserByColor(String color);
    List<String> moreThanThreeArticles();
}
