package com.duzgun.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.duzgun.blog.model.entity.Post;
import com.duzgun.blog.service.PostService;

@RestController
@RequestMapping(value = {"/post"})
public class PostController {
	@Autowired
	PostService postService;
	
	@PostMapping(value = "/create",headers = "Accept=applicateion/json")
	public ResponseEntity<Void> createPost(@RequestBody Post post, UriComponentsBuilder ucBuilder){		
		postService.createPost(post);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(ucBuilder.path("/Post/{id}").buildAndExpand(post.getId()).toUri());
		
		return new ResponseEntity<Void>(header,HttpStatus.CREATED);
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/get", headers = "Accept=application/json")
	public List<Post> getAllPost() {		
		List<Post> posts = postService.getPost();
		
		return posts;
	}
}
