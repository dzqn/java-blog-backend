package com.duzgun.blog.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "Post")
public class Post  implements Serializable
{

	@Id
	@Column(name = "Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Column
	@NotBlank(message = "Enter a title ")
	private String Title;

	@Column
	private String Body;
	
	@Column
	private Date CreateDate;

	@Column
	private Date UpdateDate;

	@Column
	private Boolean IsActive;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Category_Id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Category Category;

	public Post() {
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

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

	@JsonIgnore
	public Category getCategory() {
		return Category;
	}

	@JsonIgnore
	public void setCategory(Category category) {
		Category = category;
	}

	public Long getCategory_Id() {
		return Category.getId();
	}

	public String getCategory_Name() {
		return Category.getName();
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
