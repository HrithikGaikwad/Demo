package com.Ideation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IdeationPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdeationPlatformApplication.class, args);
	}

}
