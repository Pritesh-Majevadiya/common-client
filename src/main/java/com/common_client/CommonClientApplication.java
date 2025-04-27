package com.common_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CommonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonClientApplication.class, args);

		System.out.println("Common Client service Started...");
	}

}
