package com.cgi.msref.accountclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class AccountClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountClientApplication.class, args);
	}
}
