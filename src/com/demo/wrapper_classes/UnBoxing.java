package com.demo.wrapper_classes;

public class UnBoxing {
	public static void main(String[] args) {
		int a =1000;
		Integer il = Integer.valueOf(a);// boxing
		int v1 = il.intValue();// unboxing
		byte v2 = il.byteValue(); // unboxing
		System.out.println(v1);
		System.out.println(v2);
		// parsing
		String b = "20";
		int v3 = Integer.parseInt(b);
		System.out.println(v3);	}
}
