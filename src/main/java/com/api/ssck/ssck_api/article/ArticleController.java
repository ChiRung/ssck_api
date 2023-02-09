package com.api.ssck.ssck_api.article;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.ssck.ssck_api.article.Entity.ArticleEntity;
import com.api.ssck.ssck_api.common.BaseController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController(value = "/article")
public class ArticleController extends BaseController {
    
    final ArticleService articleService;

    @GetMapping("/all")
    public Map<String, Object> getAllArticles() {
        return super.setResponseObject(articleService.getAllArticles());
    }

    @PostMapping("/add")
    public Map<String, Object> postArticle(@RequestBody ArticleEntity article) {
        return super.setResponseObject(articleService.postArticle(article));
    }
}
