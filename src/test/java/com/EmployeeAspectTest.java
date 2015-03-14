package com;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.service.EmployeeService;

public class EmployeeAspectTest extends BaseTest {
	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testAfterReturn() {
		employeeService.getEmployeeById(2);
	}

	@Test(expected = RuntimeException.class)
	public void testAfterThrowing() {
		employeeService.getEmployeeById(null);
	}
}
