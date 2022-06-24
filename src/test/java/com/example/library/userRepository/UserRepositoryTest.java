package com.example.library.userRepository;

import org.assertj.core.api.Assertions;
import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;


@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUserTest (){
         User user =
                User.builder()
                        .id(1)
                        .name("Luk")
                        .age(22).build();
    userRepository.save(user);
    Assertions.assertThat(user.getId()).isGreaterThan(0);
    Assertions.assertThat(user.getName()).isEqualTo("Luk");
    Assertions.assertThat(user.getAge()).isEqualTo(22);
    }

    @Test
    public void getAllUsers(){
        List<User> users = new ArrayList<>();
        Iterable<User> source =userRepository.findAll();
        source.forEach(users::add);
        Assertions.assertThat(users.size()).isGreaterThan(0);
    }




    }
