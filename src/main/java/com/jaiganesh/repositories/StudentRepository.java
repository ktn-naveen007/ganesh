package com.jaiganesh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaiganesh.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//public Student findById(Integer id);
}
