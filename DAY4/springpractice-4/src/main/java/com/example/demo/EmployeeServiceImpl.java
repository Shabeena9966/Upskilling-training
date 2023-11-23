package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee getEmployeeById(long id) {
		List<Employee> employees=employeeRepository.findAll();
		Employee employee=null;
		for(Employee emp:employees) {
			if(emp.getId()==id)
				employee=emp;
		}
		return employee;
		
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		employee.setId(getMaxId());
		employeeRepository.save(employee);
		return employee;
	}
	
	public long getMaxId() {
		return employeeRepository.findAll().size()+1;
	}
	

	@Override
	public Employee updateEmployee(Employee updatedEmployee) {
		employeeRepository.save(updatedEmployee);
		return updatedEmployee;
	}
	
	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}
}

