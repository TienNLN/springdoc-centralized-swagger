package com.example.centralizedswaggerdemo.configs;

import lombok.Data;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author TienNLN on 10/01/2023
 */
@Primary
@Configuration
@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "documentation.swagger")
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

    @Bean
    public GroupedOpenApi extApi(EndpointCustomizer endpointCustomizer) {
        return GroupedOpenApi.builder()
                .group("Ext API")
                .addOperationCustomizer(endpointCustomizer)
                .build();
    }

    List<SwaggerServices> swaggerServices;

    @EnableConfigurationProperties
    @ConfigurationProperties(prefix = "documentation.swagger.services")
    @Configuration
    @Data
    public static class SwaggerServices {
        private String name;
        private String url;
        private String version;

        @Override
        public String toString() {
            return "SwaggerServices [name=" + name + ", url=" + url + ", version=" + version + "]";
        }
    }
}
