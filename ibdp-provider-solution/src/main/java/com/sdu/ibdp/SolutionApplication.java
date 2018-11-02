package com.sdu.ibdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan({"com.sdu.ibdp.mapper"})
public class SolutionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SolutionApplication.class);
    }
}
