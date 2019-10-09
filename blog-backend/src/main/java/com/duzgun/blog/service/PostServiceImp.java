package com.duzgun.blog.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duzgun.blog.model.entity.Post;
import com.duzgun.blog.repository.PostRepository;

@Service
@Transactional
public class PostServiceImp implements PostService {

	@Autowired
	PostRepository postRepository;
	
	@Override
	public void createPost(Post post) {
		/*
		 * Date date = new Date(); post.setCreateDate(date);
		 */
		
		postRepository.save(post);
	}

	@Override
	public List<Post> getPost() {
		List<Post> posts = (List<Post>)postRepository.findAll();
		return posts;
	}

	@Override
	public Post findById(long id) {
		return postRepository.findById(id).get();
	}

	@Override
	public Post update(Post post) {
		/*
		 * Date updateDate = new Date(); post.setUpdateDate(updateDate);
		 */
		
		return postRepository.save(post);
	}

	@Override
	public void deletePostById(long id) {
		postRepository.deleteById(id);
	}
	
	

}
