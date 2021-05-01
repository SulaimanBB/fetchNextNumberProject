package com.yebelo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yebelo.app.service.FetchNumberService;

@RestController
public class FetchNumberController {

	
	@Autowired
	private FetchNumberService fetchNumberService;
	
	@GetMapping(value="FetchNextNumber/{categoryCode}")
	public void fetchNextNumber(@PathVariable String categoryCode) {
		
		
		
	}
	
	
	
}
