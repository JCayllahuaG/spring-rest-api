package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;

@Embeddable
public record ManagerId(Long value) {
    public ManagerId() {
        this(null);
    }

    public ManagerId{
        if (value == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }
}
