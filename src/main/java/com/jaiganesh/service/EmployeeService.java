package com.jaiganesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaiganesh.entities.Employee;
import com.jaiganesh.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	public List<Employee> employeeRecord(){
		
		return	repo.findAll();
		 
		
	}
	
	public List<Employee> getRecords(){
		return repo.getEmpRecordCommonNative();
	}
}
