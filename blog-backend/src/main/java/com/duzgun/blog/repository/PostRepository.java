package com.duzgun.blog.repository;

import org.springframework.data.repository.CrudRepository;
import com.duzgun.blog.bean.Post;

public interface PostRepository extends CrudRepository<Post,Long> {

}
