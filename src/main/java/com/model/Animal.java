package com.model;

public class Animal {
	int age;
	String name;
	Collar collar;

	public int getAge() {
		System.out.println("getAge() called");
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge() called");
		this.age = age;
	}

	public String getName() {
		System.out.println("getName() called");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() called");
		this.name = name;
	}

	public Collar getCollar() {
		System.out.println("getCollar() called");
		return collar;
	}

	public void setCollar(Collar collar) {
		System.out.println("setCollar() called");
		this.collar = collar;
	}

	public Animal(int age, String name, Collar collar) {
		super();
		this.age = age;
		this.name = name;
		this.collar = collar;
	}

	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Animal() {
		super();
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", collar=" + collar
				+ "]";
	}

}
