package com;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Employee;
import com.service.EmployeeService;

public class AnnotationAspectTest extends BaseTest {
	@Autowired
	EmployeeService employeeService;

	@Test
	public void testDeleteEmployee() {
		employeeService.deleteEmployee(new Employee());
	}
}
