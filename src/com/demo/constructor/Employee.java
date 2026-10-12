package com.demo.constructor;

public class Employee {
	public Employee(int i, int j) {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		Employee e1=new Employee(100,200);
	}
}
