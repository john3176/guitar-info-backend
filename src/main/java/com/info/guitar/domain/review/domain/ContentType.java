package com.info.guitar.domain.review.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ContentType {

    REVIEW("CONTENT_REVIEW", "REVIEW"),
    COMMENT("CONTENT_COMMENT", "COMMENT");

    private String key;
    private String name;
}
