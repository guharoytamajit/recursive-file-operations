package com.model;

public class Collar {
	int size;

	public int getSize() {
		System.out.println("getSize() called");
		return size;
	}

	public void setSize(int size) {
		System.out.println("setSize() called");
		this.size = size;
	}

	public Collar(int size) {
		super();
		this.size = size;
	}

	public Collar() {
		super();
	}

	@Override
	public String toString() {
		return "Collar [size=" + size + "]";
	}

}
