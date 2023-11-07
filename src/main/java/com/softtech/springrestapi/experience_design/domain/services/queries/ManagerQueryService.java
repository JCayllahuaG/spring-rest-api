package com.softtech.springrestapi.experience_design.domain.services.queries;


import com.softtech.springrestapi.experience_design.domain.model.queries.manager.GetManagerById;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.manager.ManagerResource;

import java.util.List;

public interface ManagerQueryService {


    ManagerResource handle(GetManagerById managerId);

    List<ManagerResource> handle();


}
