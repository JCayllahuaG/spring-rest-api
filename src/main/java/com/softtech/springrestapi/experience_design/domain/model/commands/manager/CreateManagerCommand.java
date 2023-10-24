package com.softtech.springrestapi.experience_design.domain.model.commands.manager;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.Person;

public record CreateManagerCommand(Person person) {
}
