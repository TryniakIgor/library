package com.example.library.controller;

import DTO.UserDTO;
import com.example.library.service.UserService;
import com.example.library.service.serviseImpl.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.http.MediaType;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserService userService;
    private ObjectMapper mapper;

    @Test
    void whenGetAllUsers_thenReturnStatus200() throws Exception {
        List<UserDTO> userList = new ArrayList<>();
        userList.add(new UserDTO(1, "John", 22));
        userList.add(new UserDTO(2, "Luk",33));
        given(userService.getAllUsers()).willReturn(userList);
        mvc.perform(get("/users")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
        verify(userService).getAllUsers();
    }


//        @Autowired
//    public MockMvc mockMvc;
//
//    @MockBean
//    UserServiceImpl userService;
//    private ObjectMapper objectMapper = new ObjectMapper();
//
//    private UserDTO testUser() {
//        return UserDTO.builder()
//                .id(1)
//                .name("Luk")
//                .age(22).build();
//    }
//
//    @Test
//    void save() throws Exception {
//        UserDTO userDTO = testUser();
//
//        when(userService.saveUser(userDTO)).thenReturn(testUser());
//        MvcResult mvcResult = mockMvc
//                .perform(post("/users")
//                        .contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsBytes(userDTO)))
//                .andExpect(status().isCreated()).andReturn();
//
//        assertEquals(objectMapper.writeValueAsString(testUser()), mvcResult.getResponse().getContentAsString());
//    }
//    @Test
//    void getAllUser() throws Exception {
//                MvcResult mvcResult = mockMvc.perform(get("/users")
//                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
//        assertEquals(objectMapper.writeValueAsString(testUser()), mvcResult.getResponse().getContentAsString());
//    }

    @Test
    void moreThanAge() {
    }

    @Test
    void moreThanThreeArticles() {
    }

    @Test
    void findUserByColor() {
    }



}