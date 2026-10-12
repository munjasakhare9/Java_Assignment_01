package com.demo.inheritance.user;

public class Student extends User {

	int rank;

	public static void main(String[] args) {

		// child class object creation
		Student s = new Student();
		s.rank = 1;

		// accessing parent class properties using child cls obj
		s.id = 101;
		s.name = "Bhanu";

		System.out.println(s.id + "--" + s.name + "--" + s.rank);
	}
}
