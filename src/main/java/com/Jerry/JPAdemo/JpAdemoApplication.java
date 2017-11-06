package com.Jerry.JPAdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Jerry.JPAdemo")
public class JpAdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpAdemoApplication.class, args);
	}
}
