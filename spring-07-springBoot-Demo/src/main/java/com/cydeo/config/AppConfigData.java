package com.cydeo.config;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class AppConfigData {

    @Value("Yasin")
    private String username;
    @Value("abc123")
    private String password;
    @Value("www.cydeo.com")
    private String url;

}
