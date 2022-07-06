package com.example.library;

import com.example.library.DTO.ArticleDTO;
import com.example.library.model.Color;
import com.example.library.model.Role;
import com.example.library.model.User;
import com.example.library.service.ArticleServise;
import com.example.library.service.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
@Bean
CommandLineRunner run (RoleService roleService, ArticleServise articleServise){
		return args -> {
			roleService.saveRole(new Role(1,"ROLE_U"));
			roleService.saveRole(new Role(2,"ROLE_J"));
			roleService.saveRole(new Role(3,"ROLE_K"));
			roleService.saveRole(new Role(4,"ROLE_K"));
//
//			roleService.saveUser(new User(11,"Rik","ddd","ddd",new ArrayList<>(),22,new ArrayList<>()));
//			roleService.saveUser(new User(15,"Riyyk","ccc","ddd",new ArrayList<>(),22,new ArrayList<>()));
//			roleService.saveUser(new User(16,"Riiiik","kkk","ddd",new ArrayList<>(),22,new ArrayList<>()));
//
//			articleServise.saveArticle(new ArticleDTO(12, "ggg", Color.BLACK));
		};
}
}
