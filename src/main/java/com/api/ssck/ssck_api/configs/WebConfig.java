package com.api.ssck.ssck_api.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 개발 중 모든 요청 허용
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080", "http://localhost:1234")
                .maxAge(3000);
    }
}
