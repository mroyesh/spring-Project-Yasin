package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration

public class RandomConfig {


    @Bean
    public String testString() {
        return "Yasin";
    }

    @Bean
    public Integer testInt(){
        return 12;
    }
}
