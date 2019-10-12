package com.duzgun.blog.model.dto;

import javax.validation.constraints.NotNull;

public class CategoryDto {
	@NotNull
	private Long Id;
	@NotNull(message = "Category name boş olamaz!")
	private String Name;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
