package com.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.model.Employee;

@Aspect
@Component
@Order(2)
public class EmployeeAspect {
	@AfterReturning(pointcut = "execution(public com.model.Employee getEmployeeById(java.lang.Integer))&& args(id)", returning = "emp")
	public void afterReturningAspect(Integer id, Employee emp) {
		System.out.println("running afterReturningAspect() input:" + id
				+ " output:" + emp);
	}

	@AfterThrowing(pointcut = "execution(public com.model.Employee getEmployeeById(java.lang.Integer))&& args(id)", throwing = "e")
	public void afterThrowingAspect(Integer id, RuntimeException e) {
		System.out.println("running afterReturningAspect() input:" + id
				+ " throwing:" + e);
	}

	@Before("execution(public void saveEmployee(com.model.Employee))")
	public void beforeSaveEmployee() {
		System.out.println("EmployeeAspect.beforeSaveEmployee() called");
	}
}
