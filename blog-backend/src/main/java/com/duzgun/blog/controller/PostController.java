package com.duzgun.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.duzgun.blog.model.Request.PostCreateRequest;
import com.duzgun.blog.model.Response.PostCreateResponse;
import com.duzgun.blog.model.entity.Post;
import com.duzgun.blog.service.PostService;

@RestController
@RequestMapping(value = { "/post" })
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostController {
	@Autowired
	PostService postService;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public PostCreateResponse createPost(@RequestBody PostCreateRequest post) {
		PostCreateResponse savedPost = postService.createPost(post);

		return savedPost;
	}

	@GetMapping
	public List<Post> getAllPost() {
		List<Post> posts = postService.getPost();

		return posts;
	}
}
