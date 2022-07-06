package com.example.library.controller;

import com.example.library.model.Role;
import com.example.library.model.User;
import com.example.library.service.RoleService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @GetMapping("/usersrole")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(roleService.getUsers());
    }

    @PostMapping("/role")
    public ResponseEntity<User> saveUsers(@RequestBody User user) {
        return ResponseEntity.ok().body(roleService.saveUser(user));
    }


    @PostMapping("/role/addToUser")
    public ResponseEntity<Role> addRoleToUser(@RequestBody RoleToUserForm form) {
        roleService.addRoleToUser(form.getUserName(), form.getRoleName());
        return ResponseEntity.ok().build();
    }
}

    @Data
    class RoleToUserForm{
        private String userName;
        private String roleName;
    }

