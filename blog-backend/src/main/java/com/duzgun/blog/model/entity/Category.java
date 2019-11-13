package com.duzgun.blog.model.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Category")
public class Category {


	@Column(name = "Id", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	@Column(name = "Name")
	@NotBlank(message = "Enter a Name ")
	private String Name;
	
	@Column
	private Date CreateDate;

	@Column
	private Date UpdateDate;

	@Column
	private Boolean IsActive;

	@OneToMany(mappedBy = "Category", fetch = FetchType.LAZY)
	private Set<Post> Posts = new HashSet<>();

	public Category() {

	}

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

	// @JsonIgnore
	public Set<Post> getPosts() {
		return Posts;
	}

	// @JsonIgnore
	public void setPosts(Set<Post> posts) {
		Posts = posts;
	}
	
	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date createDate) {
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

}
