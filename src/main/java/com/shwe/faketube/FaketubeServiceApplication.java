package com.shwe.faketube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableFeignClients
@SpringBootApplication
@EnableResourceServer
public class FaketubeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaketubeServiceApplication.class, args);
	}

}
