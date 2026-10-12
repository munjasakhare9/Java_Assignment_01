package com.demo.inheritance.single.user;

class Child extends Parent {

	public int hashCode() {
		return 101;
	}

	void m1() {
		System.out.println("Child - Class - m1() Called");
	}

	void m2() {
		System.out.println("Child - Class - m2() called");
		super.m2();
	}
}
