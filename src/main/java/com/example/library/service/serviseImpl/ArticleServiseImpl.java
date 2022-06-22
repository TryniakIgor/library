package com.example.library.service.serviseImpl;

import com.example.library.model.Article;
import com.example.library.model.Color;
import com.example.library.model.User;
import com.example.library.repository.ArticleRepository;
import com.example.library.service.ArticleServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiseImpl implements ArticleServise {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Article saveArticle( Article article)
    {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> getAllArticles() {
        List<Article> articles = new ArrayList<>();
        articleRepository.findAll().forEach(articles::add);
        return articles;
    }



}
