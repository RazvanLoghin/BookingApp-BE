package com.booking.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BookingAppBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingAppBeApplication.class, args);

		System.out.println("Starting the app...");
	}

}
