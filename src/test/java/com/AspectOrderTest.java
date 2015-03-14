package com;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Employee;
import com.service.EmployeeService;

public class AspectOrderTest extends BaseTest {
	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testEmployeeSave() {
		employeeService.saveEmployee(new Employee());
	}

}
