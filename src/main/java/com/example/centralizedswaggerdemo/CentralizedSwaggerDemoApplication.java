package com.example.centralizedswaggerdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "CO2 API", version = "1.0", description = "Documentation CO2 API v1.0")
)
public class CentralizedSwaggerDemoApplication {

    @Bean
    public GroupedOpenApi bookApi() {
        return GroupedOpenApi.builder()
                .group("Book API")
                .packagesToScan("com.example.controllers")
                .build();
    }

    @Bean
    public GroupedOpenApi testApi() {
        return GroupedOpenApi.builder()
                .group("Test API")
                .packagesToScan("com.example.controllers")
                .pathsToMatch("/tests")
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(CentralizedSwaggerDemoApplication.class, args);
    }
}
