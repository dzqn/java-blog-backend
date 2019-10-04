package com.duzgun.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duzgun.blog.bean.User;
import com.duzgun.blog.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService {
	
    @Autowired
    UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> getUser() {
        return (List<User>) userRepository.findAll();
    }

	
    public User findById(long id) {
        return userRepository.findById(id).get();
    }
	 

    public User update(User user, long id) {
        return userRepository.save(user);
    }

    public void deleteUserById(long id) {
        userRepository.deleteById(id);;
    }

    public User updatePartially(User user, long id) {
        User usr = findById(id);
        usr.setCountry(user.getCountry());
        return userRepository.save(usr);
    }
}