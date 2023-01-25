package com.eagle.eye.eureka.eaeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EaEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaEurekaServiceApplication.class, args);
    }

}
