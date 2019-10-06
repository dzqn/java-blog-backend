package com.duzgun.blog.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	@Column(name = "Name")
	private String Name;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "Category")
	private Set<Post> Posts = new HashSet<>();

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

	public Set<Post> getPosts() {
		return Posts;
	}

	public void setPosts(Set<Post> posts) {
		Posts = posts;
	}

	
}
