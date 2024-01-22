package com.info.guitar.domain.review.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProductType {

    GUITAR("PRODUCT_GUITAR", "GUITAR"),
    PICKUP("PRODUCT_PICKUP", "PICKUP");

    private String key;
    private String name;
}
