package com.example.demoForJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoForJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForJpaApplication.class, args);
	}

}
