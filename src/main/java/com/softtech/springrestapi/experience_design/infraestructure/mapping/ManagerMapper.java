package com.softtech.springrestapi.experience_design.infraestructure.mapping;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Manager;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.UpdateManagerInfoCommand;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.Person;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.CreateManagerResource;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.ManagerResource;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.UpdateManagerResource;
import com.softtech.springrestapi.shared.mapping.EnhancedModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;



public class ManagerMapper implements Serializable {

    @Autowired
    public EnhancedModelMapper mapper;




    public ManagerResource toResource(Manager model) {


        mapper.typeMap(Manager.class, ManagerResource.class)
                .addMappings(m -> m.map(Manager::getPerson, ManagerResource::setPerson));

        return mapper.map(model, ManagerResource.class);
    }
    public Manager toModel(ManagerResource resource) {
        return mapper.map(resource, Manager.class);
    }
    public Manager toModel(CreateManagerResource resource) {
        return mapper.map(resource, Manager.class);
    }
    public Manager toModel(UpdateManagerResource resource) {
        return mapper.map(resource, Manager.class);
    }

}
