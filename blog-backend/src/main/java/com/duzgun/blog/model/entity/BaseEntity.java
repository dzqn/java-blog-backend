package com.duzgun.blog.model.entity;

import java.util.Date;

import javax.persistence.Column;

public class BaseEntity {
	@Column
	private Date CreateDate;

	@Column
	private Date UpdateDate;

	@Column
	private Boolean IsActive;

	public BaseEntity() {
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
