package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;

@Embeddable
public record Price(
        Double amount,
        String currency
) {
    public Price() {
        this(null, null);
    }
}
