package com.softtech.springrestapi.experience_design.domain.services.queries;

import com.softtech.springrestapi.experience_design.domain.model.queries.agency.GetAgencyById;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency.AgencyResource;

import java.util.List;

public interface AgencyQueryService {

    AgencyResource handle(GetAgencyById query);

    List<AgencyResource> handle();

}
