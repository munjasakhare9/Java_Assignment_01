package com.demo.objectclass;

public class Student3 {

	int id; 
	String name;
	
	public Student3() {
		
	}

	public Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Student3 s1 = new Student3(101, "John");
		Student3 s2 = new Student3(101, "John");

		System.out.println(s1.equals(s2)); // false - compares address
		System.out.println(s1 == s2); // false - compares address

		String s3 = new String("hi");
		String s4 = new String("hi");

		System.out.println(s3.equals(s4)); // true - compares content of objects

	}


}
