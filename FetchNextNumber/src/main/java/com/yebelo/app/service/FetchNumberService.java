package com.yebelo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yebelo.app.dao.FetchNumberDAO;
import com.yebelo.app.model.Category;

@Service
public class FetchNumberService {

	@Autowired
	private FetchNumberDAO fetchNumberDAO;
	
	public synchronized Category getNextNumber(String categoryCode) {
		
		int fetchedNumber = fetchNumberDAO.getCategoryValue(categoryCode);
		
		int nextNum = ++fetchedNumber;
		
		while(true) {
			
			if(calculateSum(nextNum) == 1) 
				break;
			++nextNum;
		}
		
		Category category = new Category();
		category.setValue(fetchedNumber);
		category.setNextValue(nextNum);
		category.setCategoryCode(categoryCode);
		
		// Update the next number to database
		fetchNumberDAO.updateCategoryValue(category);
		return category;
	}
	
	
	// This is to return final sum
	private int calculateSum(int num) {
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		if(String.valueOf(sum).length() > 1) {
			return calculateSum(sum);
		}
		return sum;
	}
	
}
