package com.rabbit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearnApplication.class, args);
	}
}
