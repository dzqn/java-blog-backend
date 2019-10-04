package com.duzgun.blog.service;

import java.util.List;

import com.duzgun.blog.bean.Post;

public interface PostService {
	public void createPost(Post post);
    public List<Post> getPost();
    public Post findById(long id);
    public Post update(Post post);
    public void deletePostById(long id);
}
