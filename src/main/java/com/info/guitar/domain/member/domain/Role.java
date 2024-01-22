package com.info.guitar.domain.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {

    ADMIN("ROLE_ADMIN", "ADMIN"),
    MANAGER("ROLE_MANAGER", "MANAGER"),
    USER("ROLE_USER", "USER");

    private String key;
    private String name;
}
