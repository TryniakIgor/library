package com.example.library.service.serviseImpl;

import com.example.library.model.Color;
import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;



    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
    @Override
    public List<User> moreThanAge(int age) {
        List<User> users = new ArrayList<>();
         userRepository.findAll().forEach(users::add);
        return users.stream().filter(x->x.getAge()>age).collect(Collectors.toList());
    }
    @Override
    public List<String> moreThanThreeArticles(){

        return userRepository.moreThanThreeArticles();
    }

    public List<User> findUserByColor(String color){
        Color enumColor = Color.valueOf(color);
        return userRepository.findAllByArticlesColor(enumColor);
    }






}
