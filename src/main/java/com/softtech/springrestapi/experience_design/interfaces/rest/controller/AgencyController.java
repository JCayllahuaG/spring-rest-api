package com.softtech.springrestapi.experience_design.interfaces.rest.controller;

import com.softtech.springrestapi.experience_design.domain.model.commands.agency.CreateAgencyCommand;
import com.softtech.springrestapi.experience_design.domain.model.queries.agency.GetAgencyById;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.AgencyId;
import com.softtech.springrestapi.experience_design.domain.services.commands.AgencyCommandService;
import com.softtech.springrestapi.experience_design.domain.services.queries.AgencyQueryService;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency.AgencyResource;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.agency.CreateAgencyResource;
import com.softtech.springrestapi.shared.validation.ObjectValidator;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agencies")
@AllArgsConstructor
@SecurityRequirement(name = "Keycloak")
@Tag(name = "Agencies Endpoints", description = "Agency API")
public class AgencyController {


    private final AgencyQueryService agencyQueryService;
    private final AgencyCommandService agencyCommandService;
    private final ObjectValidator validator;


    @PostMapping
    @PreAuthorize("hasRole('admin_client_role')")
    @Operation(summary = "Register a new agency")
    public ResponseEntity<AgencyResource> registerAgency(@RequestBody CreateAgencyResource resource){

        validator.validate(resource);

        CreateAgencyCommand command = new CreateAgencyCommand(resource.getAgencyDetails(), resource.getManagerId());


        return new ResponseEntity<>(agencyCommandService.handle(command), org.springframework.http.HttpStatus.CREATED);
    }

    @GetMapping
    @PreAuthorize("hasRole('user_client_role')")
    @Operation(summary = "Get all agencies")
    public ResponseEntity<List<AgencyResource>> getAllAgencies(){
        return new ResponseEntity<>(agencyQueryService.handle(), org.springframework.http.HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get an agency by id")
    public ResponseEntity<AgencyResource> getAgencyById(@PathVariable Long id){
        GetAgencyById query = new GetAgencyById(new AgencyId(id));
        return new ResponseEntity<>(agencyQueryService.handle(query), org.springframework.http.HttpStatus.OK);
    }

}
