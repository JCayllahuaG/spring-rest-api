package com.softtech.springrestapi.shared.configuration;

import com.softtech.springrestapi.shared.mapping.EnhancedModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("enhancedModelMapperConfiguration")
public class MappingConfiguration {
    @Bean
    public EnhancedModelMapper enhancedModelMapper(){
        return new EnhancedModelMapper();
    }
}