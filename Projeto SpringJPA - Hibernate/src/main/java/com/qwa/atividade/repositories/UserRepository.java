package com.qwa.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qwa.atividade.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
