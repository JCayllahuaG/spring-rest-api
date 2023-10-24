package com.softtech.springrestapi.experience_design.interfaces.rest.resources;

import com.softtech.springrestapi.experience_design.domain.model.entities.Location;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes.AgencyNetwork;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.ManagerId;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.Person;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateManagerResource {
    @NotNull
    private Long id;

    @Embedded
    @NotNull
    private Person person;

    @Embedded
    @NotNull
    private AgencyNetwork agencyNetwork;
}
