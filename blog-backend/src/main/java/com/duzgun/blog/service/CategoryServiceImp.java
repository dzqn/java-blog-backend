package com.duzgun.blog.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duzgun.blog.model.Response.ResponseCreateCategory;
import com.duzgun.blog.model.Response.ResponseGetAllCategory;
import com.duzgun.blog.model.entity.Category;
import com.duzgun.blog.repository.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImp implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public ResponseCreateCategory createCategory(Category category) {
		ResponseCreateCategory savedCategory = new ResponseCreateCategory();
		Category scategory =	categoryRepository.save(category);
		
		savedCategory.setId(scategory.getId());
		savedCategory.setName(scategory.getName());
		
		return savedCategory;
	}

	@Override
	public List<ResponseGetAllCategory> getAllCategory() {
		List<Category> allCategories = (List<Category>) categoryRepository.findAll();

		List<ResponseGetAllCategory> result = allCategories.stream().map(x -> {
			ResponseGetAllCategory c = new ResponseGetAllCategory();
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
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategoryById(long id) {
		categoryRepository.deleteById(id);
	}
}