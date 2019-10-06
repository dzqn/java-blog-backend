package com.duzgun.blog.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.duzgun.blog.bean.Category;
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
    public List<Category> getCategory() {
        return (List<Category>) categoryRepository.findAll();
    }
	
    @Override
    public Category findById(long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category update(Category category, long id) {
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