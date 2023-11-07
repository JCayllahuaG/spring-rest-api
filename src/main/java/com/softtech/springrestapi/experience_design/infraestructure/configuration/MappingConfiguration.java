package com.softtech.springrestapi.experience_design.infraestructure.configuration;

import com.softtech.springrestapi.experience_design.infraestructure.mapping.AgencyMapper;
import com.softtech.springrestapi.experience_design.infraestructure.mapping.ManagerMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("experienceDesignMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public ManagerMapper managerMapper(){
        return new ManagerMapper();
    }


    @Bean
    public AgencyMapper agencyMapper(){
        return new AgencyMapper();
    }
}
