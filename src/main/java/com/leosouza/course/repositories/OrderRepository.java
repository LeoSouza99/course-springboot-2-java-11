package com.leosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosouza.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
