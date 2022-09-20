package com.cydeo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
@Data
@ConfigurationProperties(prefix = "db")
public class DBConfigData {

    private String username;
    private String password;
    private String url;
    private List<String>type;



}
