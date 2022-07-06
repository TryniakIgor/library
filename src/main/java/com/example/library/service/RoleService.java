package com.example.library.service;

import com.example.library.model.Role;
import com.example.library.model.User;

import java.util.List;

public interface RoleService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User>getUsers();

}
