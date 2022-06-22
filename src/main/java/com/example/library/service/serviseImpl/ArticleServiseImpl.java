package com.example.library.service.serviseImpl;

import DTO.ArticleDTO;
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
import java.util.stream.Collectors;

@Service
public class ArticleServiseImpl implements ArticleServise {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public ArticleDTO saveArticle( ArticleDTO articleDTO)
    {

        return toDTO(articleRepository.save(toEntity(articleDTO)));
    }

    @Override
    public List<ArticleDTO> getAllArticles() {
        List<Article> articles = new ArrayList<>();
        articleRepository.findAll().forEach(articles::add);
        return articles.stream().map(x->toDTO(x)).collect(Collectors.toList());
    }

    public static ArticleDTO toDTO(Article article) {
        return ArticleDTO.builder()
                .id(article.getId())
                .text(article.getText())
                .color(article.getColor())
                .build();
    }
    public static Article toEntity(ArticleDTO articleDTO) {
        return Article.builder()
                .id(articleDTO.getId())
                .text(articleDTO.getText())
                .color(articleDTO.getColor())
                .build();

    }

}
