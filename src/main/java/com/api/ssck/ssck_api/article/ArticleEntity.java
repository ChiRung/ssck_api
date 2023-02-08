package com.api.ssck.ssck_api.article;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
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

    @Embedded
    ContentBlockEntity blocks;
    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(name = "articleId")
    // List<ContentBlockEntity> blocks;

    // @Builder
    // public ArticleEntity(Long time, List<ContentBlockEntity> blocks) {
    //     this.time = time;
    //     this.blocks = blocks;
    // }
}
