package com.demo.objectclass;

public class Student2 {

	int id;
	String name;

	public static void main(String[] args) {

		Student3 s = new Student3();
		s.id = 101;
		s.name = "John";

		System.out.println(s); // toString ( ) will be called
		System.out.println(s.hashCode());
	}

	public String toString() {
		return id + "--" + name;
	}

	public int hashCode() {
		return id;
	}

}
