package com.duzgun.blog.service;

import java.util.List;

import com.duzgun.blog.bean.User;


public interface UserService {
	public void createUser(User user);
    public List<User> getUser();
    public User findById(long id);
    public User update(User user, long id);
    public void deleteUserById(long id);
    public User updatePartially(User user, long id);

}
