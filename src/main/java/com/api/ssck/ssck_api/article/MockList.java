package com.api.ssck.ssck_api.article;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class MockList {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @ElementCollection
    List<String> texts;
}
