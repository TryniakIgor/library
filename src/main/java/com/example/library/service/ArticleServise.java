package com.example.library.service;

import com.example.library.model.Article;

import java.util.List;

public interface ArticleServise {
    Article saveArticle(Article article);
    List<Article> getAllArticles();

}
