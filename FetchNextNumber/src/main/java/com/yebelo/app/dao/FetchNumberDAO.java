package com.yebelo.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yebelo.app.model.Category;

@Repository
public class FetchNumberDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getCategoryValue(String categoryCode) {
		try {
			return jdbcTemplate.queryForObject("Select category_value from tblcategory where category_code = ? limit 1", new Object[] {categoryCode}, int.class);			
		} catch (Exception e) {
			return 0;
		}
	}

	public void updateCategoryValue(Category category) {
		jdbcTemplate.update("update tblcategory set category_value = ? where category_code = ?", new Object[] {category.getValue(), category.getCategoryCode()});
	}
	
}
