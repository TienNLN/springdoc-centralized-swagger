package com.example.centralizedswaggerdemo.configs;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author TienNLN on 10/01/2023
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi bookApi() {
        return GroupedOpenApi.builder()
                .group("book-api")
                .packagesToScan("com.example.centralizedswaggerdemo.controllers")
                .build();
    }

    @Bean
    public GroupedOpenApi testApi() {
        return GroupedOpenApi.builder()
                .group("Test API")
                .packagesToScan("com.example.centralizedswaggerdemo.controllers")
                .pathsToMatch("/api/**")
                .build();
    }
}
