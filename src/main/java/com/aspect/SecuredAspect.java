package com.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Controller;

import com.annotation.Secured;

@Aspect
@Controller
public class SecuredAspect {

	@Around("@annotation(com.annotation.Secured)")
	public void authorize(ProceedingJoinPoint joinPoint) throws Throwable {
		String currentUserRole = getCurrentUserRole();
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Secured secured = method.getAnnotation(Secured.class);
		String role = secured.role();
		if (currentUserRole.equals(role)) {
			System.out.println("authorized user");
			joinPoint.proceed();
		} else {
			System.out.println("unauthorized user");
		}
	}

	public String getCurrentUserRole() {
		// here you will generally lookup from UserContext
		return "user";
	}
}
