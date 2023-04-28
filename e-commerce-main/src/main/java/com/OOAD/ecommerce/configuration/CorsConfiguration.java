

//CROSS ORIGIN RESURCE SHARING


package com.OOAD.ecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//This annotation indicates that the class is a configuration class and should be processed by the Spring container.
@Configuration
public class CorsConfiguration {

    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String DELETE = "DELETE";

    @Bean //it is a spring bean that returns a WebMvcConfigurer object

    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) { //overrriding the function
                registry.addMapping("/**")//CORS should be enabled for all the end points for the application
                        .allowedMethods(GET, POST, PUT, DELETE)
                        .allowedHeaders("*")
                        .allowedOriginPatterns("*")
                        .allowCredentials(true); //cookies and other credentials can be sent with CORS requet
            }
        };
    }
}
