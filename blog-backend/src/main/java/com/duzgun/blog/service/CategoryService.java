package com.duzgun.blog.service;

import java.util.List;

import com.duzgun.blog.model.Request.RequestCreateCategory;
import com.duzgun.blog.model.Response.ResponseCreateCategory;
import com.duzgun.blog.model.Response.ResponseGetCategory;
import com.duzgun.blog.model.entity.Category;;


public interface CategoryService {
	public ResponseCreateCategory createCategory(RequestCreateCategory category);
    public List<ResponseGetCategory> getAllCategory();
    public ResponseGetCategory findCategoryById(long id);
    public Category updateCategory(Category category, long id);
    public void deleteCategoryById(long id);
}
