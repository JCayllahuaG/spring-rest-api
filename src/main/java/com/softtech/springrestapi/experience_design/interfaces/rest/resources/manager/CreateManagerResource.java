package com.softtech.springrestapi.experience_design.interfaces.rest.resources.manager;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.Person;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateManagerResource {
    @Embedded
    @NotNull
    private Person person;
}
