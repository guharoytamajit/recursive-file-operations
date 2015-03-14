package com.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Controller;

@Aspect
@Controller
public class LoggingAspect {

	@Around("@annotation(com.annotation.Logger)")
	public int advice5(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		Logger logger = Logger.getLogger(proceedingJoinPoint.getTarget()
				.getClass());
		int sum = 0;
		logger.debug("called before " + proceedingJoinPoint.getSignature());
		// here you can change the input parameters like this
		sum = (Integer) proceedingJoinPoint.proceed(new Object[] {
				new Integer(7), new Integer(7) });
		logger.debug("called before " + proceedingJoinPoint.getSignature());
		return sum;
	}
}
