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

import com.duzgun.blog.model.Request.RequestCreatePost;
import com.duzgun.blog.model.Response.ResponseCreatePost;
import com.duzgun.blog.model.entity.Post;
import com.duzgun.blog.service.PostService;

@RestController
@RequestMapping(value = { "/post" })
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostController {
	@Autowired
	PostService postService;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<ResponseCreatePost> createPost(@RequestBody RequestCreatePost post, UriComponentsBuilder ucBuilder) {
		ResponseCreatePost savedPost = postService.createPost(post);
		
		HttpHeaders header = new HttpHeaders();
		header.setLocation(ucBuilder.path("/Post/{id}").buildAndExpand(savedPost.getId()).toUri());

		return new ResponseEntity<ResponseCreatePost>(savedPost,header, HttpStatus.CREATED);
	}

	@GetMapping
	public List<Post> getAllPost() {
		List<Post> posts = postService.getPost();

		return posts;
	}
}
