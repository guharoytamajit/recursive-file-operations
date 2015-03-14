package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.model.Employee;

@Aspect
@Component
@Order(1)
public class EmployeeAspect2 {
	@Around("execution(public com.model.Employee getEmployeeById(java.lang.Integer))&& args(id)")
	public Employee aroundAspect(ProceedingJoinPoint proceedingJoinPoint,
			Integer id) throws Throwable {
		Employee employee = null;
		System.out
				.println("before getEmployeeById call from EmployeeAspect2 input:"
						+ id);
		try {
			employee = (Employee) proceedingJoinPoint.proceed();
			System.out
					.println("after getEmployeeById call from EmployeeAspect2 output:"
							+ employee);
		} catch (Exception e) {
			System.out
					.println("after getEmployeeById throws exception from EmployeeAspect2 exception:"
							+ e);
		}
		return employee;
	}

	@Before("execution(public void saveEmployee(com.model.Employee))")
	public void beforeSaveEmployee() {
		System.out.println("EmployeeAspect2.beforeSaveEmployee() called");
	}
}
