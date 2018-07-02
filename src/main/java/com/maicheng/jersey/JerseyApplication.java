package com.maicheng.jersey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class JerseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JerseyApplication.class, args);
	}
}
