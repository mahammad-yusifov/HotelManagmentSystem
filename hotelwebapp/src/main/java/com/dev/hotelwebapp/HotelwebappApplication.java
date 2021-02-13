package com.dev.hotelwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HotelwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelwebappApplication.class, args);
	}

}
