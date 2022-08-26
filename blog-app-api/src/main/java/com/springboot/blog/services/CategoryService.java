package com.springboot.blog.services;

import java.util.List;

import com.springboot.blog.payloads.CategoryDto;

public interface CategoryService {
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	void deleteCategory(Integer categoryId);
	
	//get single
	CategoryDto getCategory(Integer categoryId);
	
	//get all
	List<CategoryDto> getCategories();
}
