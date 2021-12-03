package com.leosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosouza.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
