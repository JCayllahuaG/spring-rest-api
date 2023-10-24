package com.softtech.springrestapi.experience_design.interfaces.rest.controller;

import com.softtech.springrestapi.experience_design.domain.model.commands.manager.CreateManagerCommand;
import com.softtech.springrestapi.experience_design.domain.services.commands.IManagerCommandService;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.CreateManagerResource;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.ManagerResource;
import com.softtech.springrestapi.shared.validation.ObjectValidator;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/managers")
@AllArgsConstructor
public class ManagerController {

    private final IManagerCommandService managerCommandService;

    private final ObjectValidator validator;


    @PostMapping
    @Operation(summary = "Create a new manager")
    public ResponseEntity<ManagerResource> registerManager(@RequestBody CreateManagerResource resource){

        validator.validate(resource);

        CreateManagerCommand command = new CreateManagerCommand(resource.getPerson());
        return new ResponseEntity<>(managerCommandService.handle(command), HttpStatus.CREATED);
    }
}
