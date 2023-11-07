package com.softtech.springrestapi.experience_design.domain.services.commands;

import com.softtech.springrestapi.experience_design.domain.model.commands.agency.CreateAgencyCommand;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency.AgencyResource;

public interface AgencyCommandService {

    AgencyResource handle(CreateAgencyCommand command);
}
