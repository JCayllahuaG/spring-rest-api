package com.softtech.springrestapi.shared.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    public OpenAPI customOpenAPI(){


        return new OpenAPI()
                .info(new Info()
                        .title("Go2Climb REST API")
                        .version("1.0.0")
                        .description("This is a REST API for Go2Climb application")
                        .termsOfService("https://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org"))
                        .contact(new Contact()
                                .url("https://softtech.com")
                                .name("SoftTech")));
    }

}