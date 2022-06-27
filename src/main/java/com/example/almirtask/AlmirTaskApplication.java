package com.example.almirtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AlmirTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlmirTaskApplication.class, args);
    }

}
