package com.demo.wrapper_classes;

public class ProgramBoxing1 {
	public static void main(String[] args) {
		Integer a, b;
		a = new Integer(10); // manual boxing
		a = 10; // auto boxing
		b = 20;// auto boxing
		int c = a.intValue() + b.intValue(); // manual un-boxing
		int d = a + b; // auto un-boxing
		System.out.println(d);
	}
}
