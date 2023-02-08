package com.api.ssck.ssck_api.common;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ssck.ssck_api.article.ArticleRepository;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
@RestController
public class IndexController extends BaseController {
    @Autowired
     ArticleRepository articleRepository;

    @GetMapping("/")
    public Map<String, Object> index() {
        // articleRepository.findAll();
        return super.setResponseObject("달라란에 오신걸 환영합니다!");
    }

    @GetMapping({ "/swagger", "/Swagger", "/api", "/test", "/tester" })
    public void redirectSwagger(HttpServletResponse response) throws Exception {
        response.sendRedirect("/swagger-ui/index.html");
    }
}
