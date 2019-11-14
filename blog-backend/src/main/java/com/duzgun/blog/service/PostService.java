package com.duzgun.blog.service;

import java.util.List;

import com.duzgun.blog.model.Request.RequestCreatePost;
import com.duzgun.blog.model.Response.ResponseCreatePost;
import com.duzgun.blog.model.entity.Post;

public interface PostService {
	public ResponseCreatePost createPost(RequestCreatePost post);
    public List<Post> getPost();
    public Post findById(long id);
    public Post update(Post post);
    public void deletePostById(long id);
}
