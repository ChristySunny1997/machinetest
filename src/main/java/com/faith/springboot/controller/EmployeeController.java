package com.faith.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.springboot.entity.Employee;
import com.faith.springboot.service.IEmployeeService;



@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {

	
	@Autowired
	private IEmployeeService employeeService;
		
	//listing all the employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	// get employee by using id
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer id){
		return employeeService.getEmployeeById(id);
	}
	
	// add new employee
	@PostMapping("/employees/add")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	// update existing employee
	@PutMapping("/employees/{id}/update")
	public void updateEmployee(@RequestBody Employee emp) {
		employeeService.updateEmployee(emp);
	}
	
	// deleting the existing employee
	@DeleteMapping("/employees/{id}/delete")
	public void deleteEmployee(@PathVariable Integer id) {
		employeeService.deleteEmployee(id);
	}
	
}
