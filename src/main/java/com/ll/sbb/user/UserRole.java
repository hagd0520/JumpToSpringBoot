package com.ll.sbb.user;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
