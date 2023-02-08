package com.api.ssck.ssck_api.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository
public interface ContentBlockRepository extends JpaRepository<ContentBlockEntity, Long> {
    
}
