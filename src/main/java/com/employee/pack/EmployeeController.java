package com.employee.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jaiganesh.entities.Employee;
import com.jaiganesh.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping(value = "employee", method = RequestMethod.GET)
	public void getEmployeeDetails(){
		List<Employee> emp= service.employeeRecord();
		
		for(Employee ee:emp){
			System.out.println(ee.getEid()+"--"+ee.getEname()+"--"+ee.getErole());
		}
	}
}
