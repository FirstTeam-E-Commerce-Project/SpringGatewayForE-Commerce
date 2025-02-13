package com.example.springgatewayexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringGatewaypplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGatewaypplication.class, args);
    }

}
