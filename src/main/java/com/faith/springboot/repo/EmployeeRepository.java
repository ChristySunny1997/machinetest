package com.faith.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.springboot.entity.Employee;

//extends from crud repository class to get all CRUD opertions
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
