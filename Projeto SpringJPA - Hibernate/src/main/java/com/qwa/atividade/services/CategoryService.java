package com.qwa.atividade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Hibernate;

import com.qwa.atividade.entities.Category;
import com.qwa.atividade.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

  
	@Transactional(readOnly = true) 
	public List<Category> findAll(){
		List<Category> categories = repository.findAll();
		for (Category category : categories) {
			Hibernate.initialize(category.getProducts()); 
		}
		return categories;
	}
	
	@Transactional(readOnly = true)
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		Category category = obj.orElse(null);
		if (category != null) {
			Hibernate.initialize(category.getProducts()); 
		}
		return category;
}
}

	