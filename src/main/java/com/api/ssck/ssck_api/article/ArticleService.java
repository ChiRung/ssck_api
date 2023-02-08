package com.api.ssck.ssck_api.article;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ArticleService {
    
    final ArticleRepository articleRepository;

    public List<ArticleEntity> getAllArticles() {
        return articleRepository.findAll();
    }

    public String postArticle(ArticleEntity article) {
        articleRepository.save(article);
        return "호옹이";
    }
}
