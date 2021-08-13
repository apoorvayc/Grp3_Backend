package com.rkit.jpaproject;

import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaprojectApplication.class, args);
		Timestamp instant= Timestamp.from(Instant.now()); 
		
		System.out.println(instant.toString());
	}

}
