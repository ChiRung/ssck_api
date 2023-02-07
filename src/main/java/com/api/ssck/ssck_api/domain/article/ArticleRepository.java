package com.api.ssck.ssck_api.domain.article;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository <ArticleEntity, String> {
    // Optional<UserEntity> findByUserEmail(String userEmail);
    // Optional<List<ArticleEntity>> findAllArticles();
    List<ArticleEntity> findAll();
    

}