package com.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AutomationTravelAgency1Application {

	public static void main(String[] args) {
		SpringApplication.run(AutomationTravelAgency1Application.class, args);
	}

}
