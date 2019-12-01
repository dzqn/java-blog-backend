package com.duzgun.blog.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duzgun.blog.model.Request.PostCreateRequest;
import com.duzgun.blog.model.Response.PostCreateResponse;
import com.duzgun.blog.model.Response.PostGetResponse;
import com.duzgun.blog.model.entity.Post;
import com.duzgun.blog.repository.PostRepository;

@Service
@Transactional
public class PostServiceImp implements PostService {
	@Autowired
	PostRepository postRepository;

	@Override
	public PostCreateResponse createPost(PostCreateRequest post) {
		Date date = new Date();
		Post savePost = new Post();
		savePost.setTitle(post.getTitle());
		savePost.setBody(post.getBody());
		savePost.setCreateDate(date);
		savePost.setIsActive(post.getIsActive());
		savePost.setCategory(post.getCategory());
		postRepository.save(savePost);

		PostCreateResponse savedPost = new PostCreateResponse();
		savedPost.setId(savePost.getId());
		savedPost.setTitle(savePost.getTitle());
		savedPost.setBody(savePost.getBody());
		savedPost.setCreateDate(savePost.getCreateDate());
		savedPost.setIsActive(savePost.getIsActive());

		return savedPost;
	}

	@Override
	public List<Post> getPost() {
		List<Post> posts = (List<Post>) postRepository.findAll();
		return posts;
	}

	@Override
	public PostGetResponse findById(long id) {
		Post post =	postRepository.findById(id).get();
		
		PostGetResponse response = new PostGetResponse();
		response.setId(post.getId());
		response.setTitle(post.getTitle());
		response.setBody(post.getBody());
		response.setCreateDate(post.getCreateDate());
		response.setUpdateDate(post.getUpdateDate());
		response.setIsActive(post.getIsActive());
		
		return response;		
	}

	@Override
	public Post update(Post post) {
		return postRepository.save(post);
	}

	@Override
	public void deletePostById(long id) {
		postRepository.deleteById(id);
	}
}
