package com.appli.springbootsecurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SpringBootSecurityJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityJpaApplication.class, args);
    }
}
