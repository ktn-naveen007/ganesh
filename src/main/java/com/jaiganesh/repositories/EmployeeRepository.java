package com.jaiganesh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jaiganesh.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query(nativeQuery=true,value="select  * from employee")
	public List<Employee> getEmpRecordCommonNative();
	
}
