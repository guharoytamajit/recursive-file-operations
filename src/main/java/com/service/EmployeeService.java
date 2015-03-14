package com.service;

import org.springframework.stereotype.Service;

import com.annotation.Secured;
import com.model.Employee;

@Service
public class EmployeeService {
	public Employee getEmployeeById(Integer id) {
		System.out.println("getEmployeeById called");
		if (id == null) {
			throw new RuntimeException("Employee not found");
		}
		return new Employee(id);
	}

	public void saveEmployee(Employee employee) {

	}

	@Secured(role = "admin")
	public void deleteEmployee(Employee employee) {
		System.out.println("employee deleted");
	}
}
