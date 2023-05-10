package com.springboot.blog;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot Blog App REST APIs",
                description = "Spring Boot Blog App REST APIs Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Minh Khoi",
                        email = "minhkhoi11.04nhmk@gmail.com",
                        url = "https://minhkhoi.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://minhkhoi.com/license"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot Blog App REST APIs Documentation",
                url = "https://github.com/khoinhmse150853/spring-blog-api"
        )
)
public class SpringbootBlogRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
    }
}
