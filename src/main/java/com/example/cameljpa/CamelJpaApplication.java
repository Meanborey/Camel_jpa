package com.example.cameljpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.cameljpa")
public class CamelJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelJpaApplication.class, args);
	}

}
