package ru.hogwarts.school;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class SkyHogwartsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkyHogwartsApplication.class, args);
    }

}
