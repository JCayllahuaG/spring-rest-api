package com.softtech.springrestapi.experience_design.application.internal.queryservices;


import com.softtech.springrestapi.experience_design.domain.model.queries.manager.GetManagerById;
import com.softtech.springrestapi.experience_design.domain.services.queries.ManagerQueryService;
import com.softtech.springrestapi.experience_design.infraestructure.mapping.ManagerMapper;
import com.softtech.springrestapi.experience_design.infraestructure.repositories.ManagerRepository;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.manager.ManagerResource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagerQueryServiceImpl implements ManagerQueryService {

    private final ManagerRepository managerRepository;
    @Autowired
    private  ManagerMapper managerMapper;
    @Override
        public ManagerResource handle(GetManagerById query) {

        return managerRepository.findById(query.id().value())
                .map(managerMapper::toResource)
                .orElseThrow(() -> new IllegalArgumentException("Manager with id: " + query.id().value() + " not found"));

    }

    @Override
    public List<ManagerResource> handle() {
        return managerRepository.
                findAll()
                .stream()
                .map(managerMapper::toResource)
                .toList();
    }
}
