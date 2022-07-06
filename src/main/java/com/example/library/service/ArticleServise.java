package com.example.library.service;

import com.example.library.DTO.ArticleDTO;

import java.util.List;

public interface ArticleServise {
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    List<ArticleDTO> getAllArticles();

}
