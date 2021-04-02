package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Courses;

@Repository

public interface CourseRepository extends CrudRepository<Courses,Long>,JpaRepository<Courses,Long> {
	   

}


