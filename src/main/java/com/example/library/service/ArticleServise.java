package com.example.library.service;

import DTO.ArticleDTO;
import com.example.library.model.Article;

import java.util.List;

public interface ArticleServise {
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    List<ArticleDTO> getAllArticles();

}
