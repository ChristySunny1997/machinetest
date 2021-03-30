package com.faith.springboot.service;

import java.util.List;
import java.util.Optional;

import com.faith.springboot.entity.Employee;


public interface IEmployeeService {

	
	//to get all Employee
	List<Employee> getAllEmployee();

	//to get the Employee by id
	Optional<Employee> getEmployeeById(Integer id);

	//for adding new Employee
	void addEmployee(Employee user);

	//for updating Employee
	void updateEmployee(Employee user);

	//for deleting existing Employee
	void deleteEmployee(Integer id);

}
