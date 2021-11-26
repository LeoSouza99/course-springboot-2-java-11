package com.leosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosouza.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
