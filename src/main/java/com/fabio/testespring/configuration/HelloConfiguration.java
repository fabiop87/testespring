package com.fabio.testespring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    @Bean
    public MyService MyService(){
        return new MyService();
    }
}
