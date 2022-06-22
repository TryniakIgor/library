package com.example.library.userRepository;

import com.example.library.model.User;
import com.example.library.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;



@SpringBootTest
public class UserRepositoryTest {


    @Autowired
    private UserRepository userRepository;



    }
