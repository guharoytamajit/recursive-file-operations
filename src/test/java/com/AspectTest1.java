package com;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Animal;

public class AspectTest1 extends BaseTest {

	@Autowired
	private Animal animal;

	@Test
	public void testGetters() {
		animal.getCollar();
		animal.getAge();
		System.out.println("done");
	}
}
