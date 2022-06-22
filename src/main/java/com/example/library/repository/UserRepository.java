package com.example.library.repository;

import com.example.library.model.Color;
import com.example.library.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.TypedQuery;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {



        @Query(value = "select distinct u.name from User u where (select count (a) from Article a where a.user.id = u.id) > 2 ")
        public List<String> moreThanThreeArticles ();

        @Query("select u from User u left join Article a on u.id=a.user.id where a.color =:color ")
         List<User> findAllByArticlesColor (Color color);




}



