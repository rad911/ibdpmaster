package com.sdu.ibdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VisualizationApplication {
    public static void main(String[] args) {
        SpringApplication.run(VisualizationApplication.class);
    }
}
