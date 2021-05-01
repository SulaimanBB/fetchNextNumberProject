package com.yebelo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yebelo.app.service.FetchNumberService;

@SpringBootApplication
public class FetchNextNumberApplication implements CommandLineRunner {

	@Autowired
	private FetchNumberService fetchNumberService;
	
	public static void main(String[] args) {
		SpringApplication.run(FetchNextNumberApplication.class, args); 
		
		//fetchNumberService.isResultOne(19);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int resultOne = fetchNumberService.calculateSum(99991);
		System.out.println("Final: "+resultOne);
		
	}
	
}
