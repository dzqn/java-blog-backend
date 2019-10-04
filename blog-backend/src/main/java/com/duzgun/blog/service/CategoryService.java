package com.duzgun.blog.service;

import java.util.List;

import com.duzgun.blog.bean.Category;;


public interface CategoryService {
	public void createCategory(Category category);
    public List<Category> getCategory();
    public Category findById(long id);
    public Category update(Category category, long id);
    public void deleteCategoryById(long id);

}
