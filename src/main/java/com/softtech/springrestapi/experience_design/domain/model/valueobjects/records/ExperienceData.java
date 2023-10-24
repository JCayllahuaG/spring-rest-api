package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;

@Embeddable
public record ExperienceData(
        String name,
        String description
) {
    public ExperienceData() {
        this(null, null);
    }
}
