package com.demo.objectclass;

public class Student {

	int id;
	String name;

	public static void main(String[] args) {

		Student3 s = new Student3();
		s.id = 101;
		s.name = "John";

		System.out.println(s); // toString ( ) will be called
		System.out.println(s.toString());

		String s1 = new String("hi");
		System.out.println(s1);
	}

	public String toString() {
		return id + "--" + name;
	}

}
