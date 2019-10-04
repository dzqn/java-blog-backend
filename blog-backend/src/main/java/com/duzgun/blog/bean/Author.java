package com.duzgun.blog.bean;

import java.util.Date;
import java.util.List;

public class Author {
	
	private Long Id;
	private String Name;
	private String Title;
	private String UserName;
	private String Password;
	private Date CreateDate;
	private Date UpdateDate;
	private Boolean IsActive;
	
	
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
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getCreteDate() {
		return CreateDate;
	}
	public void setCreteDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getUpdateDate() {
		return UpdateDate;
	}
	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}
	public Boolean getIsActive() {
		return IsActive;
	}
	public void setIsActive(Boolean isActive) {
		IsActive = isActive;
	}
	public List<Post> getPosts() {
		return Posts;
	}
	public void setPosts(List<Post> posts) {
		Posts = posts;
	}
	public List<Comment> getComments() {
		return Comments;
	}
	public void setComments(List<Comment> comments) {
		Comments = comments;
	}
	private List<Post> Posts;
	private List<Comment> Comments;

}
