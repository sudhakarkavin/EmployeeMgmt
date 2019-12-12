package com.sudhakar.employee.mgmt.repository;

import org.springframework.data.repository.CrudRepository;

import com.sudhakar.employee.mgmt.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
