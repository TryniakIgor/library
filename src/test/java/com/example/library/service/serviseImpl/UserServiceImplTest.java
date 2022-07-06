package com.example.library.service.serviseImpl;

import com.example.library.DTO.UserDTO;
import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    private User expectedUser;
    private UserDTO expectedUserDTO;

    @BeforeEach
    void setUp() {
        expectedUserDTO =
        UserDTO.builder()
                .id(1)
                .name("Luk")
                .age(22).build();

        expectedUser = User.builder()
                .id(1)
                .name("Luk")
                .age(22)
                .build();
    }
    @Test
    void saveUser() {
        when(userRepository.save(any(User.class))).thenReturn(expectedUser);

        userService.saveUser(expectedUserDTO);
        assertNotNull(expectedUser);
        assertEquals("Luk", expectedUser.getName());
        assertEquals(22, expectedUser.getAge());

    }

    @Test
    void getAllUsers() {
        List<User> listExpected = new ArrayList<User>();
        listExpected.add(expectedUser);
        List<UserDTO> listToDtolistExpected = listExpected.stream().map(UserServiceImpl::toDTO).collect(Collectors.toList());

        when(userRepository.findAll()).thenReturn(listExpected);

        List<UserDTO> listActual = userService.getAllUsers();

        assertEquals(listActual, listToDtolistExpected);
    }
}