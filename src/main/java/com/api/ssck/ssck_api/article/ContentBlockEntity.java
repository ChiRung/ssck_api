package com.api.ssck.ssck_api.article;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Embeddable
// @Entity
@RequiredArgsConstructor
@Data
public class ContentBlockEntity {

    // @Id
    // Long articleId;

    @Id
    @Column(name = "blockId")
    String id;

    String type;

    String style;

    String text;

    @ElementCollection
    List<String> texts;

    @Builder
    public ContentBlockEntity(String id, String type, String style, String text, List<String> texts) {
        this.id = id;
        this.type = type;
        this.style = style;
        this.text = text;
        this.texts = texts;
    }
}
