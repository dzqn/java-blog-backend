package com.duzgun.blog.model.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Post")
public class Post  implements Serializable
{

	@Column(name = "Id", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Column
	@NotBlank(message = "Enter a title ")
	private String Title;

	@Column
	private String Body;

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
}
