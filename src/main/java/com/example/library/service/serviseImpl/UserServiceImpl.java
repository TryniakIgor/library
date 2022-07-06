package com.example.library.service.serviseImpl;

import com.example.library.DTO.UserDTO;
import com.example.library.model.Color;
import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO saveUser(UserDTO userDTO){

        return toDTO(userRepository.save(toEntity(userDTO)));
    }
    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }
    @Override
    public List<UserDTO> moreThanAge(int age) {
        List<UserDTO> users = getAllUsers();
        return users.stream().filter(x->x.getAge()>age).collect(Collectors.toList());
    }
    @Override
    public List<String> moreThanThreeArticles(){

        return userRepository.moreThanThreeArticles();
    }
    @Override
    public List<UserDTO> findUserByColor(String color){
        Color enumColor = Color.valueOf(color);
        List<User> users = userRepository.findAllByArticlesColor(enumColor);
        return users.stream().map(UserServiceImpl::toDTO).collect(Collectors.toList());
    }

    public static UserDTO toDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .userName(user.getUserName())
                .password(user.getPassword())
                .name(user.getName())
                .age(user.getAge())
                .build();
    }
    public static User toEntity(UserDTO userDTO) {
        return User.builder()
                .id(userDTO.getId())
                .name(userDTO.getName())
                .userName(userDTO.getUserName())
                .password(userDTO.getPassword())
                .age(userDTO.getAge())
                .build();

    }

}
