package com.qwa.atividade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
import org.hibernate.Hibernate;

import com.qwa.atividade.entities.Product;
import com.qwa.atividade.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	public List<Product> findAll(){
		List<Product> products = repository.findAll();
		for (Product product : products) {
			Hibernate.initialize(product.getCategories()); 
		}
		return products;
	}

	@Transactional(readOnly = true)
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		Product product = obj.orElse(null); 
		if (product != null) {
			
			Hibernate.initialize(product.getCategories()); 
		}
		return product;
	}
}