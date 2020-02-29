package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleProjectApplication.class, args);
	}

	@Bean
	public void hello() {
		System.out.println("Welcome to Spring boot");
	}
}
