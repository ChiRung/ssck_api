package com.api.ssck.ssck_api.common;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class IndexController extends BaseController {

    @GetMapping("/")
    public Map<String, Object> index() {
        return super.setResponseObject("달라란에 오신걸 환영합니다!");
    }

    @GetMapping({ "/swagger", "/Swagger", "/api", "/test", "/tester" })
    public void redirectSwagger(HttpServletResponse response) throws Exception {
        response.sendRedirect("/swagger-ui/index.html");
    }
}
