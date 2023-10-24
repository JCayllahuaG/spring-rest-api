package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;

@Embeddable
public record ManagerId(Long id) {
    public ManagerId() {
        this(null);
    }

    public ManagerId{
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (id < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }
}
