package com.duzgun.blog.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duzgun.blog.model.Request.RequestCreateCategory;
import com.duzgun.blog.model.Response.ResponseCreateCategory;
import com.duzgun.blog.model.Response.ResponseGetCategory;
import com.duzgun.blog.model.entity.Category;
import com.duzgun.blog.repository.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImp implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public ResponseCreateCategory createCategory(RequestCreateCategory category) {
		
		ResponseCreateCategory savedCategory = new ResponseCreateCategory();
		
		Category saveCategory = new Category();
		saveCategory.setName(category.getName());
		
		categoryRepository.save(saveCategory);

		savedCategory.setId(saveCategory.getId());
		savedCategory.setName(saveCategory.getName());

		return savedCategory;
	}

	@Override
	public List<ResponseGetCategory> getAllCategory() {
		List<Category> allCategories = (List<Category>) categoryRepository.findAll();

		List<ResponseGetCategory> result = allCategories.stream().map(x -> {
			ResponseGetCategory c = new ResponseGetCategory();
			c.setId(x.getId());
			c.setName(x.getName());
			return c;
		}).collect(Collectors.toList());

		return result;
	}

	@Override
	public ResponseGetCategory findCategoryById(long id) {

		Optional<Category> category = categoryRepository.findById(id);

		if (category.isEmpty())
			return null;
		else
			return category.map(x -> {
				ResponseGetCategory c = new ResponseGetCategory();
				c.setId(x.getId());
				c.setName(x.getName());
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