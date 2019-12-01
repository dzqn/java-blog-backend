package com.duzgun.blog.service;

import java.util.List;

import com.duzgun.blog.model.Request.PostCreateRequest;
import com.duzgun.blog.model.Response.PostCreateResponse;
import com.duzgun.blog.model.Response.PostGetResponse;
import com.duzgun.blog.model.entity.Post;

public interface PostService {
	public PostCreateResponse createPost(PostCreateRequest post);
    public List<Post> getPost();
    public PostGetResponse findById(long id);
    public Post update(Post post);
    public void deletePostById(long id);
}
