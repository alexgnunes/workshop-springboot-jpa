package com.alexnunes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexnunes.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
