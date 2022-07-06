package com.example.library.repository;

import com.example.library.model.Role;
import com.example.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);

}
