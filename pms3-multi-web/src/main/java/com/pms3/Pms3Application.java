package com.pms3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan("com.pms3")
public class Pms3Application {
	
	private static final Logger logger = LogManager.getLogger(Pms3Application.class);

	public static void main(String[] args) {
		logger.info("Spring Boot 시작(log4j2 사용)");
		SpringApplication.run(Pms3Application.class, args);
	}

}
