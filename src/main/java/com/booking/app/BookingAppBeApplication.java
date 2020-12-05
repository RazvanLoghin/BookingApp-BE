package com.booking.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class BookingAppBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingAppBeApplication.class, args);

		System.out.println("Starting the app...");
	}

}
