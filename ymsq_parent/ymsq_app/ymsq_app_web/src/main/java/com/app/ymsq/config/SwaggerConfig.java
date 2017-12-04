package com.app.ymsq.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/*
 * Restful API 访问路径:
 * http://IP:port/{context-path}/swagger-ui.html
 * eg:http://localhost:8080/jd-config-web/swagger-ui.html
 */
@EnableWebMvc
@EnableSwagger2
@Configuration
@ComponentScan(basePackages ="com.app.ymsq.controller")
public class SwaggerConfig extends WebMvcConfigurationSupport {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.app.ymsq.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringMVC中使用Swagger2构建RESTful APIs")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(new Contact("xxxxx","xxxxxx","xxxxxx"))
                .version("1.0.0")
                .build();
    }

}


