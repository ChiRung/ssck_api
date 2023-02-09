package com.api.ssck.ssck_api.article;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.ssck.ssck_api.article.Entity.ArticleEntity;
import com.api.ssck.ssck_api.article.Repository.ArticleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ArticleService {
    
    final ArticleRepository articleRepository;

    public List<ArticleEntity> getAllArticles() {
        return articleRepository.findAll();
    }

    public List<ArticleEntity> postArticle(ArticleEntity article) {
        Long savedArticleId = articleRepository.save(article).getArticleId();
        return articleRepository.findAllByArticleId(savedArticleId);
    }
}
