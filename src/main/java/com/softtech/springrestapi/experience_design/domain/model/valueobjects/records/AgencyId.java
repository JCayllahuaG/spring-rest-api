package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;
@Embeddable
public record AgencyId(Long id)  {
    public AgencyId() {
        this(null);
    }
    public AgencyId{
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (id < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }
}
