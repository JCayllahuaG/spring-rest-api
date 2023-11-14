package com.softtech.springrestapi.experience_design.application.internal.commandservices;

import com.softtech.springrestapi.experience_design.domain.model.commands.agency.CreateAgencyCommand;
import com.softtech.springrestapi.experience_design.domain.services.commands.AgencyCommandService;
import com.softtech.springrestapi.experience_design.infraestructure.mapping.AgencyMapper;
import com.softtech.springrestapi.experience_design.infraestructure.repositories.AgencyRepository;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency.AgencyResource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgencyCommandServiceImpl implements AgencyCommandService {

    private final AgencyRepository agencyRepository;


    @Autowired
    private final AgencyMapper agencyMapper;

    @Override
    public AgencyResource handle(CreateAgencyCommand command) {
        return new AgencyResource();
    }
}
