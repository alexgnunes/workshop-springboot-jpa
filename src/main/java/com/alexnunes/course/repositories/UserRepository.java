package com.alexnunes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexnunes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
