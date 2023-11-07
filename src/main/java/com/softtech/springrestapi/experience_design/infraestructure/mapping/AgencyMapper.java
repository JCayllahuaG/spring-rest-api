package com.softtech.springrestapi.experience_design.infraestructure.mapping;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Agency;
import com.softtech.springrestapi.experience_design.domain.model.commands.agency.CreateAgencyCommand;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency.AgencyResource;
import com.softtech.springrestapi.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;


public class AgencyMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper mapper;


    public AgencyResource toResource(Agency model) {
        return mapper.map(model, AgencyResource.class);
    }


    public Agency toEntity(CreateAgencyCommand resource) {
        return mapper.map(resource, Agency.class);
    }
}
