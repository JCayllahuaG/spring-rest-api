package com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.AgencyDetails;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.ManagerId;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateAgencyResource {


    @NotNull
    AgencyDetails agencyDetails;

    @NotNull
    ManagerId managerId;
}
