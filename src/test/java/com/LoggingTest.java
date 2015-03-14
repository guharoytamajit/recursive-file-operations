package com;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Calculator;

public class LoggingTest extends BaseTest {
	@Autowired
	private Calculator calculator;

	@Test
	public void testAdvice5() {
		System.out.println(calculator.add(2, 8));
	}

}
