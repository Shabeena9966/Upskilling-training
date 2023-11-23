package com.example.demo;

import java.util.List;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(long id);
	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee updatedEmployee);
	void deleteEmployee(Employee employee);

}