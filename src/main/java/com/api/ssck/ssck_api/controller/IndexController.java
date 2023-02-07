package com.api.ssck.ssck_api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ssck.ssck_api.domain.article.ArticleEntity;
import com.api.ssck.ssck_api.service.ArticleService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class IndexController extends BaseController {

    final ArticleService articleService;

    @GetMapping("/")
    public Map<String, Object> index() {
        return setResponseObject("index controller");
    }

        @GetMapping("/article")
    public List<ArticleEntity> getAllArticles() {

        return null;
        // List<ArticleEntity> a = new ArrayList<>();
         
        

        // try {
        //     // a = articleRepo.findAll();
        //     a = articleService.findAllArticles();
        //     System.out.println("a에용"+ a);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("ERROR_MAN" +e);
        // }
        // return a;
    }

    @GetMapping("/artititi")
    public Map<String, Object> addArticles() {
        ArticleEntity entity = ArticleEntity.builder().time((long) 1111111111).build();
        
        articleService.saveArticle(entity);
        return setResponseObject("다시 만나용", entity);
    }


    @PostMapping("/article")
    public void name() {
        
    }
}
