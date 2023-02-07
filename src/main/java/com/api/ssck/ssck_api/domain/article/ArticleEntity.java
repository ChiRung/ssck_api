package com.api.ssck.ssck_api.domain.article;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Table(name = "article")
@Data
@Entity(name = "article")
@EntityListeners(AuditingEntityListener.class)
public class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long articleId;

    Long time;

    @JoinColumn
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<ArticleBlockEntity> block = new ArrayList<>();

    @Builder
    public ArticleEntity(Long articleId, Long time, List<ArticleBlockEntity> block) {
        this.articleId = articleId;
        this.time = time;
        this.block = block;
    }

}
