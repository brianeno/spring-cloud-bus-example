package com.brianeno.spring.configurations.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApp.class, args);
	}

}
