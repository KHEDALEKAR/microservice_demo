package com.example.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication(scanBasePackages = "com.example.rating")
@EnableEurekaClient
public class RatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingApplication.class, args);
	}

}
