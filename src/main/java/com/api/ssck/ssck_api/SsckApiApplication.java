package com.api.ssck.ssck_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsckApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsckApiApplication.class, args);
		System.out.println("open in => " + "http://localhost:1234");
	}

}
