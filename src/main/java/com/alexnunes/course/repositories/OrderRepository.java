package com.alexnunes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexnunes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
