package com.api.ssck.ssck_api.article.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ssck.ssck_api.article.Entity.ArticleEntity;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long>  {
    List<ArticleEntity> findAll();
    List<ArticleEntity> findAllByArticleId(Long articleId);
}
