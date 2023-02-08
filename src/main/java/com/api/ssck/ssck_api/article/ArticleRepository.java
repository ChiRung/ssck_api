package com.api.ssck.ssck_api.article;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long>  {
    List<ArticleEntity> findAll();

    List<ArticleEntity> findAllByArticleId(Long articleId);
}
