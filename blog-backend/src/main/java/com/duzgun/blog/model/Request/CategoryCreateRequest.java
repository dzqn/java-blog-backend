package com.duzgun.blog.model.Request;


public class CategoryCreateRequest {
	private long Id;
	
	private String Name;
	
	private Boolean IsActive;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Boolean getIsActive() {
		return IsActive;
	}
	public void setIsActive(Boolean isActive) {
		IsActive = isActive;
	}
}
