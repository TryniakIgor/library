package com.example.library.repository;

import com.example.library.model.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ArticleRepository extends CrudRepository<Article, Integer> {



}
