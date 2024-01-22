package com.info.guitar.domain.product.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BrandType {

    GUITAR("BRAND_GUITAR", "GUITAR"),
    PICKUP("BRAND_PICKUP", "PICKUP"),
    ALL("BRAND_ALL", "ALL");

    private String key;
    private String name;
}
