package com.yebelo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yebelo.app.service.FetchNumberService;

@SpringBootApplication
public class FetchNextNumberApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FetchNextNumberApplication.class, args); 
		
		
	}

	
}
