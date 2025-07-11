package com.qwa.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qwa.atividade.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
