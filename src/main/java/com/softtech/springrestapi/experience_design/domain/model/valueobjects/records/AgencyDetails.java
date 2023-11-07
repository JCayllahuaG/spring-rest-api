package com.softtech.springrestapi.experience_design.domain.model.valueobjects.records;

import com.softtech.springrestapi.experience_design.domain.model.entities.Location;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Embeddable
public record AgencyDetails(

    String name,
    String profilePhotoUrl,
    String description,
    String email,
    @OneToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    Location location,
    String ruc,
    String phone,
    String rating
) {
    public AgencyDetails() {
        this(null, null, null, null, null, null, null, null);
    }
}
