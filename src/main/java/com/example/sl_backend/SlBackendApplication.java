package com.example.sl_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlBackendApplication {

    public static void main(String[] args) {
        System.out.println("Miau go: SpringApplication.run(SlBackendApplication.class, args);");
        SpringApplication.run(SlBackendApplication.class, args);
        System.out.println("Miau done: SpringApplication.run(SlBackendApplication.class, args);\");");
    }
}
