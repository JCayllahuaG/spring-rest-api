package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;
import jdk.jfr.Unsigned;

@Embeddable
public record Person(
        String name,
        String lastName,
        String dni,
        @Unsigned
        Short age,
        String phone
) {
    public Person() {
        this(null, null, null, null, null);
    }
}
