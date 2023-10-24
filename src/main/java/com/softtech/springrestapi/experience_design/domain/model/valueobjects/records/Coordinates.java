package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import jakarta.persistence.Embeddable;

@Embeddable
public record Coordinates(
        Double latitude,
        Double longitude) {
    public Coordinates() {
        this(null, null);
    }
    public Coordinates{
        if (latitude == null || longitude == null) {
            throw new IllegalArgumentException("Latitude and longitude must not be null");
        }
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Latitude must be between -90 and 90");
        }
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Longitude must be between -180 and 180");
        }
    }
}
