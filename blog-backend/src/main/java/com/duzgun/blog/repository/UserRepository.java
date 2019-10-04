package com.duzgun.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.duzgun.blog.bean.User;

public interface UserRepository extends CrudRepository<User,Long> {

}
