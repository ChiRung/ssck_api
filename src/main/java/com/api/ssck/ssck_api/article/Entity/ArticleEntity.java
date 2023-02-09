package com.api.ssck.ssck_api.article.Entity;

import java.util.List;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity(name = "article")
public class ArticleEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long articleId;

    Long time;
    
    @ElementCollection
    List<ContentBlockEntity> blocks;
}
