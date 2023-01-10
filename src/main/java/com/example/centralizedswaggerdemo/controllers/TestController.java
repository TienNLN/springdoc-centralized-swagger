package com.example.centralizedswaggerdemo.controllers;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TienNLN on 09/01/2023
 */
@RestController
public interface TestController {

    @GetMapping("tests/testApi")
    String testApi();
}
