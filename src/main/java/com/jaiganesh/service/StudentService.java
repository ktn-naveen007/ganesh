package com.jaiganesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaiganesh.entities.Student;
import com.jaiganesh.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repo;

	public void insertRecord(Integer id,String name,String subject) {
		Student st = new Student();
		st.setId(id);
		st.setStudentName(name);
		st.setStudentSubject(subject);
		repo.save(st);
	}

}
