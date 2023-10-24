package com.softtech.springrestapi.experience_design.domain.model.commands.manager;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.ManagerId;

public record RemoveManagerCommand(ManagerId managerId) {
}
