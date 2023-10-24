package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;

@Embeddable
public record ExperienceId(Long id) {

    public ExperienceId() {
        this(null);
    }
    public ExperienceId{
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (id < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }
}
