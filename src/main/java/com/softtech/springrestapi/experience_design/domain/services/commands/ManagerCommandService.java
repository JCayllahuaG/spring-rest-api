package com.softtech.springrestapi.experience_design.domain.services.commands;

import com.softtech.springrestapi.experience_design.domain.model.commands.manager.CreateManagerCommand;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.RemoveManagerCommand;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.UpdateManagerInfoCommand;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.manager.ManagerResource;

public interface ManagerCommandService {
    ManagerResource handle(CreateManagerCommand command);
    ManagerResource handle(UpdateManagerInfoCommand command);
    void handle(RemoveManagerCommand command);
}
