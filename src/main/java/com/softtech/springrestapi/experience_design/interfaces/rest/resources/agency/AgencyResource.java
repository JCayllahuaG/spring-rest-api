package com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency;

import com.softtech.springrestapi.experience_design.domain.model.entities.Location;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.AgencyDetails;
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


    @Embedded
    private AgencyDetails agencyDetails;

    @NotNull
    @Embedded
    private ManagerId managerId;

}
