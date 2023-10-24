package com.softtech.springrestapi.experience_design.domain.services.commands;

import com.softtech.springrestapi.experience_design.domain.model.commands.manager.CreateManagerCommand;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.RemoveManagerCommand;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.UpdateManagerInfoCommand;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.ManagerResource;

public interface IManagerCommandService {
    ManagerResource handle(CreateManagerCommand command);
    ManagerResource handle(UpdateManagerInfoCommand command);
    void handle(RemoveManagerCommand command);
}
