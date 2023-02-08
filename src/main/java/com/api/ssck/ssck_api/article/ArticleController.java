package com.api.ssck.ssck_api.article;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController(value = "/article")
public class ArticleController {
    
    final ArticleService articleService;

    @GetMapping("/all")
    public List<ArticleEntity> getAllArticles() {
        return articleService.getAllArticles();
    }

    @PostMapping("/add")
    public Object postArticle(@RequestBody ArticleEntity article) {
        return articleService.postArticle(article);
    }
}
