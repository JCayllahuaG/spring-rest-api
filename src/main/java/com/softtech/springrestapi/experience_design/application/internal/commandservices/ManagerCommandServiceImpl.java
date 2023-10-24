package com.softtech.springrestapi.experience_design.application.internal.commandservices;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Manager;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.CreateManagerCommand;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.RemoveManagerCommand;
import com.softtech.springrestapi.experience_design.domain.model.commands.manager.UpdateManagerInfoCommand;
import com.softtech.springrestapi.experience_design.domain.services.commands.IManagerCommandService;
import com.softtech.springrestapi.experience_design.infraestructure.mapping.ManagerMapper;
import com.softtech.springrestapi.experience_design.infraestructure.repositories.IManagerRepository;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.ManagerResource;
import com.softtech.springrestapi.experience_design.interfaces.rest.transform.ManagerEntityFromCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagerCommandServiceImpl implements IManagerCommandService {


    private final IManagerRepository managerRepository;
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public ManagerResource handle(CreateManagerCommand command) {

        Boolean existManagerDni = managerRepository.existsByDni(command.person().dni());
        if (existManagerDni) {
            throw new IllegalArgumentException("Manager with dni: " + command.person().dni() + " already exists");
        }
        else{
            Manager manager = ManagerEntityFromCommand.toEntityFromCommand(command);
            return managerMapper.toResource(managerRepository.save(manager));
        }
    }
    @Override
    public ManagerResource handle(UpdateManagerInfoCommand command) {
        return null;
    }

    @Override
    public void handle(RemoveManagerCommand command) {

    }
}
