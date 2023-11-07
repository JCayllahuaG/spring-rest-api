package com.softtech.springrestapi.experience_design.domain.model.commands.agency;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.AgencyDetails;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.ManagerId;

public record CreateAgencyCommand(AgencyDetails agencyDetails, ManagerId managerId){
}
