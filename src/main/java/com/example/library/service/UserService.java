package com.example.library.service;

import DTO.UserDTO;
import com.example.library.model.Article;
import com.example.library.model.Color;
import com.example.library.model.User;

import java.util.List;

public interface UserService {
    UserDTO saveUser (UserDTO userDTO);
    List<UserDTO> getAllUsers();
    List<UserDTO> moreThanAge (int age);
    List<UserDTO> findUserByColor(String color);
    List<String> moreThanThreeArticles();
}
