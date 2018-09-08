package com.ivy.baseframe.bfsceureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BfScEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BfScEurekaApplication.class, args);
	}
}
