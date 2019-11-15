package com.duzgun.blog.repository;

import org.springframework.data.repository.CrudRepository;
import com.duzgun.blog.model.entity.Category;;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
