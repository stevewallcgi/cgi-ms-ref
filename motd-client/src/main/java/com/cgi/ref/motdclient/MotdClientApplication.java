package com.cgi.ref.motdclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MotdClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotdClientApplication.class, args);
	}
}
