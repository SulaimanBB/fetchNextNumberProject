package com.yebelo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yebelo.app.dao.FetchNumberDAO;

@Service
public class FetchNumberService {

	@Autowired
	private FetchNumberDAO fetchNumberDAO;
	
	private int getNextNumber(int fetchedNumber) {
		
		int nextNum = ++fetchedNumber;
		
		while(true) {
			
		
			
		}
		
		//return 0;
	}
	
	
	
	public int isResultOne(int num) {
		
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("String.valueOf(sum).length():-> "+String.valueOf(sum).length());
		System.out.println("Sum: "+sum);
		if(String.valueOf(sum).length() > 1) {
			return isResultOne(sum);
		}
		return sum;
	}
	
}
