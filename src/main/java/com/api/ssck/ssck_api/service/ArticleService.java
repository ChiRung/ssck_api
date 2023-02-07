package com.api.ssck.ssck_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.api.ssck.ssck_api.domain.article.ArticleEntity;
import com.api.ssck.ssck_api.domain.article.ArticleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ArticleService {
    
    final ArticleRepository articleRepo;

    public List<ArticleEntity> findAllArticles() {
        return articleRepo.findAll();
    }

    
    public ArticleEntity saveArticle(ArticleEntity entity) {
        return articleRepo.save(entity);
    }
}
