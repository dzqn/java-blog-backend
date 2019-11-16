package com.duzgun.blog.model.Request;

import com.duzgun.blog.model.entity.Category;

public class PostCreateRequest {
	private String Title;
	private String Body;
	private Boolean IsActive;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}
	public Boolean getIsActive() {
		return IsActive;
	}
	public void setIsActive(Boolean isActive) {
		IsActive = isActive;
	}
	public Category getCategory() {
		return Category;
	}
	public void setCategory(Category category) {
		Category = category;
	}
	private Category Category;

}
