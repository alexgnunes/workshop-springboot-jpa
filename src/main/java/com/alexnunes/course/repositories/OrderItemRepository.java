package com.alexnunes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexnunes.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
