package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;
@Embeddable
public record AgencyId(Long value)  {
    public AgencyId() {
        this(null);
    }
    public AgencyId{
        if (value == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }
}
