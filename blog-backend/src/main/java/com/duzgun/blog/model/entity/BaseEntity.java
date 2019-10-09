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
}
