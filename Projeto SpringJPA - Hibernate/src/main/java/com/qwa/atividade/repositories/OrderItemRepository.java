package com.qwa.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qwa.atividade.entities.OrderItem;
import com.qwa.atividade.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
