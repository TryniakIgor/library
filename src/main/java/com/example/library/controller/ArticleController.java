package com.example.library.controller;

import com.example.library.DTO.ArticleDTO;
import com.example.library.service.serviseImpl.ArticleServiseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleServiseImpl articleServiseImpl;

    @PostMapping("/articles")
    public ResponseEntity<ArticleDTO> saveArticle (
            @RequestBody ArticleDTO articleDTO)
    {
        return ResponseEntity.ok().body(articleServiseImpl.saveArticle(articleDTO));
    }
    @GetMapping("/articles")
    public ResponseEntity<List<ArticleDTO>> getAllArticle() {

        return ResponseEntity.ok().body(articleServiseImpl.getAllArticles());
    }

}
