package com.SB_MS_Service_Registery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient  // for service registry client side
@EnableFeignClients  // to access feign client 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
