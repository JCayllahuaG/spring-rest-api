package com.softtech.springrestapi.experience_design.domain.model.commands.manager;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.ManagerId;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.Person;

public record UpdateManagerInfoCommand(ManagerId managerId, Person managerInfo) {
}
