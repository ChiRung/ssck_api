package com.api.ssck.ssck_api.article.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Embeddable
public class ContentBlockEntity {
    @Column(name = "blockId")
    String id;

    String type;

    String style;

    String text;

    List<String> texts;
    // 1. blob으로 된다...
    // 2. 이미 elementcollection으로 사용되고 있는 class라 내부에서 또 elementcollection 못 씀
    // 3. 지금까지 dto를 사용하지 않고 클라이언트 통신, 서비스 로직 모두에 entity를 사용했는데
    // 이 때문에 복잡한 형태의 데이터를 처리하기 힘들어졌다. dto 만들고 나누어서 처리하도록 하는 것으로 시도할것
}
