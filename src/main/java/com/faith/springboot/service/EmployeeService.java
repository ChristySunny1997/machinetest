package com.faith.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.springboot.entity.Employee;
import com.faith.springboot.entity.User;
import com.faith.springboot.repo.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	//to get the list of employees
	@Override
	public List<Employee> getAllEmployee() {

		return (List<Employee>) employeeRepository.findAll();
	}

	//to get the employee details by using id
	@Override
	public Optional<Employee> getEmployeeById(Integer id) {

		return employeeRepository.findById(id);
	}

	//to add new employee
	@Override
	public void addEmployee(Employee emp) {

		employeeRepository.save(emp);
	}

	//updating existing employee
	@Override
	public void updateEmployee(Employee emp) {

		employeeRepository.save(emp);
	}

	//to delete existing employee
	@Override
	public void deleteEmployee(Integer id) {

		employeeRepository.deleteById(id);
	}

}
