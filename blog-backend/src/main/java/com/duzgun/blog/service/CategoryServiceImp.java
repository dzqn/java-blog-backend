package com.duzgun.blog.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duzgun.blog.model.dto.CategoryDto;
import com.duzgun.blog.model.entity.Category;
import com.duzgun.blog.repository.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImp implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public void createCategory(Category category) {
		/*
		 * Date date = new Date(); category.setCreateDate(date);
		 */
		categoryRepository.save(category);
	}

	@Override
	public List<CategoryDto> getAllCategory() {

		List<Category> allCategories = (List<Category>) categoryRepository.findAll();

		List<CategoryDto> result = allCategories.stream().map(x -> {
			CategoryDto c = new CategoryDto();
			c.setName(x.getName());
			return c;
		}).collect(Collectors.toList());

		return result;
	}

	@Override
	public Category findCategoryById(long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category updateCategory(Category category, long id) {
		/*
		 * Date date = new Date(); category.setUpdateDate(date);
		 */

		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategoryById(long id) {
		categoryRepository.deleteById(id);
	}
}