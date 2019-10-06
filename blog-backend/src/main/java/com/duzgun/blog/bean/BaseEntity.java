package com.duzgun.blog.bean;

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
