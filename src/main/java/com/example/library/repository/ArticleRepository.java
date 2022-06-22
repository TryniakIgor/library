package com.example.library.repository;

import com.example.library.model.Article;
import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository<Article, Integer> {



}
