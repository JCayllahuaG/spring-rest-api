package com.softtech.springrestapi.experience_design.interfaces.rest.resources;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes.AgencyNetwork;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.Person;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ManagerResource {
    @NotNull
    private Long id;

    @Embedded
    private Person person;

    @Embedded
    private AgencyNetwork agencyNetwork;
}
