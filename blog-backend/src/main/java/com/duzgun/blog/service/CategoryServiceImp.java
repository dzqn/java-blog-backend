package com.duzgun.blog.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duzgun.blog.model.Request.CategoryCreateRequest;
import com.duzgun.blog.model.Response.CategoryCreateResponse;
import com.duzgun.blog.model.Response.CategoryGetResponse;
import com.duzgun.blog.model.entity.Category;
import com.duzgun.blog.repository.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImp implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public CategoryCreateResponse createCategory(CategoryCreateRequest category) {	
		Date createdDate = new Date(); 
		Category saveCategory = new Category();
		saveCategory.setName(category.getName());
		saveCategory.setCreateDate(createdDate);
		saveCategory.setIsActive(category.getIsActive());
		
		categoryRepository.save(saveCategory);

		CategoryCreateResponse resultCategory = new CategoryCreateResponse();
		resultCategory.setId(saveCategory.getId());
		resultCategory.setName(saveCategory.getName());
		resultCategory.setCreateDate(saveCategory.getCreateDate());
		resultCategory.setUpdateDate(saveCategory.getUpdateDate());
		resultCategory.setIsActive(saveCategory.getIsActive());

		return resultCategory;
	}

	@Override
	public List<CategoryGetResponse> getAllCategory() {
		List<Category> allCategories = (List<Category>) categoryRepository.findAll();

		List<CategoryGetResponse> result = allCategories.stream().map(x -> {
			CategoryGetResponse c = new CategoryGetResponse();
			c.setId(x.getId());
			c.setName(x.getName());
			c.setCreateDate(x.getCreateDate());
			c.setUpdateDate(x.getUpdateDate());
			c.setIsActive(x.getIsActive());
			return c;
		}).collect(Collectors.toList());

		return result;
	}

	@Override
	public CategoryGetResponse findCategoryById(long id) {
		Optional<Category> category = categoryRepository.findById(id);

		if (category.isEmpty())
			return null;
		else
			return category.map(x -> {
				CategoryGetResponse c = new CategoryGetResponse();
				c.setId(x.getId());
				c.setName(x.getName());
				c.setCreateDate(x.getCreateDate());
				c.setUpdateDate(x.getUpdateDate());
				c.setIsActive(x.getIsActive());
				return c;
			}).get();
	}

	@Override
	public Category updateCategory(Category category, long id) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategoryById(long id) {
		categoryRepository.deleteById(id);
	}
}