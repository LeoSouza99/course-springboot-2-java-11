package com.leosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosouza.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {	

}
