package com.example.car.CarApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CarAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(CarAppApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CarAppApplication.class, args);
		//note and save to run again when just saving!
		logger.info("Hello Spring Boot");
	}

}

