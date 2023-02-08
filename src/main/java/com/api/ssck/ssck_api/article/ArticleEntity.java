package com.api.ssck.ssck_api.article;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Entity(name = "article")
public class ArticleEntity {
    // block은 어디까지나 조회에만 사용할 수 있다.
    // 등록에는 이런 형식의 Entity를 사용하면 안됨.

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long articleId;

    Long time;

    @OneToMany
    @JoinColumn
    List<ContentBlockEntity> block;

    @Builder
    public ArticleEntity(Long time, List<ContentBlockEntity> block) {
        this.time = time;
        this.block = block;
    }
}
