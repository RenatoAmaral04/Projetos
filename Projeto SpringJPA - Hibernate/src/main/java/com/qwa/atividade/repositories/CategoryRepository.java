package com.qwa.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qwa.atividade.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
