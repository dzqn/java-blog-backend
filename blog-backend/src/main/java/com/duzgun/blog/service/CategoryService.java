package com.duzgun.blog.service;

import java.util.List;

import com.duzgun.blog.model.Request.CategoryCreateRequest;
import com.duzgun.blog.model.Response.CategoryCreateResponse;
import com.duzgun.blog.model.Response.CategoryGetResponse;
import com.duzgun.blog.model.entity.Category;;


public interface CategoryService {
	public CategoryCreateResponse createCategory(CategoryCreateRequest category);
    public List<CategoryGetResponse> getAllCategory();
    public CategoryGetResponse findCategoryById(long id);
    public Category updateCategory(Category category, long id);
    public void deleteCategoryById(long id);
}
