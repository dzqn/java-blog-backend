package com.duzgun.blog.bean;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Column
	private String Title;

	@Column
	private String Body;

	@Column
	private Date CreateDate;

	@Column
	private Date UpdateDate;

	@Column
	private Boolean IsActive;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "Category_Id")
	private Category Category;	
	
	
	/*
		 * ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		 * 
		 * @JoinTable(name = "Post_Star", joinColumns = @JoinColumn(name = "Post_Id",
		 * referencedColumnName = "Id"), inverseJoinColumns = @JoinColumn(name =
		 * "Star_Id", referencedColumnName = "Id")) private List<Star> Stars;
		 * 
		 * 
		 * @OneToMany(fetch = FetchType.EAGER, mappedBy = "Post", cascade =
		 * CascadeType.ALL) private List<Comment> Comments;
		 */


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


	public Category getCategory() {
		return Category;
	}


	public void setCategory(Category category) {
		Category = category;
	}


	/*
	 * public List<Star> getStars() { return Stars; }
	 * 
	 * 
	 * public void setStars(List<Star> stars) { Stars = stars; }
	 * 
	 * 
	 * public List<Comment> getComments() { return Comments; }
	 * 
	 * 
	 * public void setComments(List<Comment> comments) { Comments = comments; }
	 */
}
