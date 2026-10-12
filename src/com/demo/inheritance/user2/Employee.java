package com.demo.inheritance.user2;

public class Employee extends User {

	double salary;

	public Employee() {
		System.out.println("Child Class :: 0-Param Constructor called");
	}

	void m2() {
		System.out.println("Child class - m2() method called");
	}

	public static void main(String[] args) {

		// creating object for child class
		Employee emp = new Employee();

		// initializing parent class properties using child obj
		emp.id = 101;
		emp.name = "John";

		// initialing child class properties using its own obj
		emp.salary = 4500.00;

		System.out.println(emp.id + "--" + emp.name + "--" + emp.salary);
	}
}
