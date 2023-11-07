package com.softtech.springrestapi.experience_design.application.internal.queryservices;

import com.softtech.springrestapi.experience_design.domain.model.queries.agency.GetAgencyById;
import com.softtech.springrestapi.experience_design.domain.services.queries.AgencyQueryService;
import com.softtech.springrestapi.experience_design.infraestructure.mapping.AgencyMapper;
import com.softtech.springrestapi.experience_design.infraestructure.repositories.AgencyRepository;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency.AgencyResource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgencyQueryServiceImpl implements AgencyQueryService {

    private final AgencyRepository agencyRepository;

    @Autowired
    private final AgencyMapper agencyMapper;
    @Override
    public AgencyResource handle(GetAgencyById query) {

        return agencyRepository.findById(query.id().value())
                .map(agencyMapper::toResource)
                .orElseThrow(() -> new RuntimeException("Agency not found"));



    }

    @Override
    public List<AgencyResource> handle() {
        return agencyRepository.findAll().stream().map(agencyMapper::toResource).toList();
    }
}
