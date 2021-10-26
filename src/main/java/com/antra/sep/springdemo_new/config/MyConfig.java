package com.antra.sep.springdemo_new.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
public class MyConfig {
    @Bean
    @Primary
    List<String> nameList() {
        return List.of("david","tom","arthur");
    }

    @Bean
    List<String> companyList() {
        return List.of("Antra","Apple","Hogar");
    }
}
