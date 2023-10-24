package com.softtech.springrestapi.experience_design.interfaces.rest.transform;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Manager;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.CreateManagerCommand;

public class ManagerEntityFromCommand {
    public static Manager toEntityFromCommand(CreateManagerCommand command) {
        return  Manager.builder()
                .person(command.person())
                .build();
    }
}
