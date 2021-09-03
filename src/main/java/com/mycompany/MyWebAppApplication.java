package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class MyWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWebAppApplication.class, args);
    }

}
