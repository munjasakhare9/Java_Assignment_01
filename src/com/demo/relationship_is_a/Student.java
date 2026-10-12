package com.demo.relationship_is_a;

class Student extends User { // IS-A relation

	public static void main(String... args) {
		Student s = new Student();
		s.id = 10;
		s.name = "Raju";
		s.speak();
	}
}