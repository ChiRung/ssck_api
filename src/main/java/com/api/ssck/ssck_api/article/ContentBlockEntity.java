package com.api.ssck.ssck_api.article;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Entity(name = "contentBlock")
public class ContentBlockEntity {

    @Id
    Long articleId;

    @Column(name = "blockId")
    String id;

    String type;

    String style;

    String text;

    List<String> texts;

    @Builder
    public ContentBlockEntity(Long articleId, String id, String type, String style, String text, List<String> texts) {
        this.articleId = articleId;
        this.id = id;
        this.type = type;
        this.style = style;
        this.text = text;
        this.texts = texts;
    }
}
