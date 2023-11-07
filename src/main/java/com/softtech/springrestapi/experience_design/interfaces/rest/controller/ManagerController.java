package com.softtech.springrestapi.experience_design.interfaces.rest.controller;

import com.softtech.springrestapi.experience_design.domain.model.commands.manager.CreateManagerCommand;
import com.softtech.springrestapi.experience_design.domain.model.queries.manager.GetManagerById;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.ManagerId;
import com.softtech.springrestapi.experience_design.domain.services.commands.ManagerCommandService;
import com.softtech.springrestapi.experience_design.domain.services.queries.ManagerQueryService;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.manager.CreateManagerResource;
import com.softtech.springrestapi.experience_design.interfaces.rest.resources.manager.ManagerResource;
import com.softtech.springrestapi.shared.validation.ObjectValidator;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/managers")
@Tag(name = "Managers Endpoints", description = "Manager API")
@AllArgsConstructor
public class ManagerController {

    private final ManagerCommandService managerCommandService;
    private final ManagerQueryService managerQueryService;
    private final ObjectValidator validator;


    @PostMapping
    @Operation(summary = "Create a new manager")
    public ResponseEntity<ManagerResource> registerManager(@RequestBody CreateManagerResource resource){
        validator.validate(resource);
        CreateManagerCommand command = new CreateManagerCommand(resource.getPerson());
        return new ResponseEntity<>(managerCommandService.handle(command), HttpStatus.CREATED);
    }
    @GetMapping
    @Operation(summary = "Get all registered managers")
    public ResponseEntity<List<ManagerResource>> getAllManagers(){
        return new ResponseEntity<>(managerQueryService.handle(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a manager by id")
    public ResponseEntity<ManagerResource> getManagerById(@PathVariable Long id){
        GetManagerById query = new GetManagerById(new ManagerId(id));
        return new ResponseEntity<>(managerQueryService.handle(query), HttpStatus.OK);
    }


}
