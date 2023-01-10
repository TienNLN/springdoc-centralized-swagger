package com.example.centralizedswaggerdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "CO2 API", version = "1.0", description = "Documentation CO2 API v1.0")
)
public class CentralizedSwaggerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CentralizedSwaggerDemoApplication.class, args);
    }
}
