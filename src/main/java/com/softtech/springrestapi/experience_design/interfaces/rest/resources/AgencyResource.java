package com.softtech.springrestapi.experience_design.interfaces.rest.resources;

import com.softtech.springrestapi.experience_design.domain.model.entities.Location;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.ManagerId;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AgencyResource {

    @NotNull
    private Long id;

    @NotNull
    @Embedded
    private ManagerId managerId;

    @NotNull
    @Embedded
    private Location location;



}
