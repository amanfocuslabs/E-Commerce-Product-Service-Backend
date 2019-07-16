package com.ea.ecommerceproductservicebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ECommerceProductServiceBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(ECommerceProductServiceBackendApplication.class, args);
	}
}
