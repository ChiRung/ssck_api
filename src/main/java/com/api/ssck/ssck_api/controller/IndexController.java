package com.api.ssck.ssck_api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class IndexController {

    @GetMapping("/")
    public Map<String, Object> index() {
        Map<String, Object> abc = new HashMap<>();
        abc.put("hello", "myNameis");
        return abc;

    }

    @GetMapping({ "/swagger", "/Swagger", "/api", "/test", "/tester" })
    public void redirectSwagger(HttpServletResponse response) throws Exception {
        response.sendRedirect("/swagger-ui/index.html");
    }
}
