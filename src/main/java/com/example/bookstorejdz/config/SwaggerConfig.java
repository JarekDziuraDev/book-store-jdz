package com.example.bookstorejdz.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    @Bean
//    public Docket swaggerApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
////                .ignoredParameterTypes(UsernamePasswordAuthenticationToken.class)//żeby token nie pokazywał się jako parametr w swagerze
//                .select()
//                .paths(PathSelectors.regex("^(?!/(error).*$).*$"))
//                .build()
//                .apiInfo(apiMetaData());
////                .securitySchemes(singletonList(createSchema()))
////                .securityContexts(singletonList(createContext()));
//    }
//
//    private ApiInfo apiMetaData() {
//        return new ApiInfo(
//                "Book Store REST API",
//                "All api's for book store appliaction",
//                "1.0",
//                "term and condition url",
//                new Contact(
//                        "BookStore Admin",
//                        "https://book-store-web.zmienic.com",
//                        "jarek4313@gmail.com"
//                ),
//                "book store license",
//                "license url",
//                Collections.emptyList()
//        );
//    }
//}
