package com.thoughtworks.justiceleague;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class JusticeLeagueApplication {

    public static void main(String[] args) {
        SpringApplication.run(JusticeLeagueApplication.class, args);
    }

}
