package com.duzgun.blog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.duzgun.blog.bean.Category;
import com.duzgun.blog.service.CategoryService;;


@RestController
@RequestMapping(value = { "/category" })
public class CategoryController {	
	@Autowired
	CategoryService categoryService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable("id") long id) {
		Category category = categoryService.findById(id);
		if (category == null) {
			return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}

	@PostMapping(value = "/create", headers = "Accept=application/json")
	public ResponseEntity<Void> createCategory(@RequestBody Category category, UriComponentsBuilder ucBuilder) {
		categoryService.createCategory(category);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/Category/{id}").buildAndExpand(category.getId()).toUri());
		
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/get", headers = "Accept=application/json")
	public List<Category> getAllCategory() {
		List<Category> categories = categoryService.getCategory();
		
		return categories;
	}

	@PutMapping(value = "/update", headers = "Accept=application/json")
	public ResponseEntity<String> updateCategory(@RequestBody Category currentCategory) {
		Category Category = categoryService.findById(currentCategory.getId());
		if (Category == null) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		categoryService.update(currentCategory, currentCategory.getId());
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}", headers = "Accept=application/json")
	public ResponseEntity<Category> deleteCategory(@PathVariable("id") long id) {
		Category Category = categoryService.findById(id);
		if (Category == null) {
			return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
		}
		categoryService.deleteCategoryById(id);
		
		return new ResponseEntity<Category>(HttpStatus.NO_CONTENT);
	}
}