package com.qwa.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qwa.atividade.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
