package com.model;

import com.annotation.Logger;

public class Calculator {
	@Logger
	public int add(int a, int b) {
		System.out.println("add called");
		return a + b;
	}
}
