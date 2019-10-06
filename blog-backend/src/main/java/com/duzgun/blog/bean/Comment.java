package com.duzgun.blog.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class Comment {
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO) private Long Id;
	 * 
	 * @Column private String Content;
	 * 
	 * @Column private Date CreateDate;
	 * 
	 * @Column private Date UpdateDate;
	 * 
	 * @Column private Boolean IsActive;
	 * 
	 * 
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "Post_Id") private Post Post;
	 * 
	 * 
	 * public Long getId() { return Id; }
	 * 
	 * public void setId(Long id) { Id = id; }
	 * 
	 * public String getContent() { return Content; }
	 * 
	 * public void setContent(String content) { Content = content; }
	 * 
	 * public Date getCreteDate() { return CreateDate; }
	 * 
	 * public void setCreteDate(Date createDate) { CreateDate = createDate; }
	 * 
	 * public Date getUpdateDate() { return UpdateDate; }
	 * 
	 * public void setUpdateDate(Date updateDate) { UpdateDate = updateDate; }
	 * 
	 * public Boolean getIsActive() { return IsActive; }
	 * 
	 * public void setIsActive(Boolean isActive) { IsActive = isActive; }
	 */
}
