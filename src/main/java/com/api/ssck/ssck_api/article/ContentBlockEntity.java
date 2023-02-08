package com.api.ssck.ssck_api.article;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class ContentBlockEntity {

    Long articleId;

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
