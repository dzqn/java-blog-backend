package com.duzgun.blog.model.Request;

import javax.validation.constraints.NotNull;

public class RequestCreateCategory {
	@NotNull
	private Long Id;
	
	@NotNull(message = "İsim boş geçilemez")
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
