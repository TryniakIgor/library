package com.example.library.service;

import com.example.library.DTO.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser (UserDTO userDTO);
    List<UserDTO> getAllUsers();
    List<UserDTO> moreThanAge (int age);
    List<UserDTO> findUserByColor(String color);
    List<String> moreThanThreeArticles();
}
