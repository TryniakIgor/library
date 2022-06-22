package com.example.library.controller;

import DTO.ArticleDTO;
import com.example.library.model.Article;
import com.example.library.model.Color;
import com.example.library.model.User;
import com.example.library.service.ArticleServise;
import com.example.library.service.serviseImpl.ArticleServiseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleServiseImpl articleServiseImpl;

    @PostMapping("/articles")
    public ArticleDTO articleDTO(
            @RequestBody ArticleDTO articleDTO)
    {
        return articleServiseImpl.saveArticle(articleDTO);
    }
    @GetMapping("/articles")
    public List<ArticleDTO> getAllArticle() {

        return articleServiseImpl.getAllArticles();
    }

}
