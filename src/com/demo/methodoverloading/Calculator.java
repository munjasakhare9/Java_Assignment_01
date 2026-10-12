package com.demo.methodoverloading;

public class Calculator {

	void add (int i, int j ) {
		System.out.println("Sum from 1st method :" + (i + j));
	}

	void add (int i, int j, int k) {
		System.out.println("Sum from 2nd method : " + (i + j + k));
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.add(10, 20);
		c.add(10, 20, 30);

		//c.add(10, 20, 30, 40);   // invalid
	}
}

