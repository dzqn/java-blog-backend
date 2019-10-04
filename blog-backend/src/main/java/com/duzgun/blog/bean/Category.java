package com.duzgun.blog.bean;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "CreateDate")
	private Date CreateDate;

	@Column(name = "UpdateDate")
	private Date UpdateDate;

	@Column(name = "IsActive")
	private Boolean IsActive;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "Category", cascade = CascadeType.ALL)
	private List<Post> Posts;

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

	public List<Post> getPosts() {
		return Posts;
	}

	public void setPosts(List<Post> posts) {
		Posts = posts;
	}

	

}
