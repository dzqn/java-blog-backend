package com.duzgun.blog.model.Request;


public class RequestCreateCategory {
	private long Id;
	
	private String Name;
	
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
}
