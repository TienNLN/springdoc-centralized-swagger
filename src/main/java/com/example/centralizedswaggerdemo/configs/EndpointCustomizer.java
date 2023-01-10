package com.example.centralizedswaggerdemo.configs;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.Operation;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;

/**
 * @author TienNLN on 10/01/2023
 */
@Primary
@Component
public class EndpointCustomizer implements OperationCustomizer {

    @Autowired
    private SwaggerConfig swaggerConfig;

    @Override
    public Operation customize(Operation operation, HandlerMethod handlerMethod) {
//        swaggerConfig.swaggerServices.forEach(swaggerService ->
//                operation.externalDocs(new ExternalDocumentation()
//                        .url("http://localhost:8081/v1/api-docs")
//                ));

        operation.externalDocs(new ExternalDocumentation()
                .url("http://localhost:8081/v1/api-docs")
        );

        return operation;
    }
}
