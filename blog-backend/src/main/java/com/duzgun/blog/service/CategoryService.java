package com.duzgun.blog.service;

import java.util.List;

import com.duzgun.blog.model.entity.Category;;


public interface CategoryService {
	public void createCategory(Category category);
    public List<Category> getCategory();
    public Category findCategoryById(long id);
    public Category updateCategory(Category category, long id);
    public void deleteCategoryById(long id);
}
