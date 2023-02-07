package com.api.ssck.ssck_api.domain.article;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;


@Entity(name = "article_block")
@EntityListeners(AuditingEntityListener.class)
public class ArticleBlockEntity {

    Long articleId;

    @Id
    @Column(name = "block_id")
    String id; // join key. block 별 고유 id

    String type; // block의 type

    String style;

    String text; // 한 줄 내용

    String[] texts; // line break 들어간 내용. text랑 texts 중 하나만 존재한다.

}
