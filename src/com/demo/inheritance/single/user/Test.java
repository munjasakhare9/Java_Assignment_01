package com.demo.inheritance.single.user;

public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		int hashcode = c.hashCode();
		System.out.println("Hash Code :: " + hashcode);
	}
}

