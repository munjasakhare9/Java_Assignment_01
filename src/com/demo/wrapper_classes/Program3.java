package com.demo.wrapper_classes;

public class Program3 {
	public static void main(String[] args) {
		Float a = new Float(10.5f);
		Float b = new Float("10.5f");

		System.out.println(a.equals(b));// true

		Float num1 = 10.5f;
		Float num2 = 10.5f;
		System.out.println(num1 == num2);// false

		Integer num3 = 100;
		Integer num4 = 100;
		System.out.println(num3 == num4);// true

		Float x = 100.5f;
		float y = x + 10;
		System.out.println(y);// 110.5

		Double d1 = 100.0;
		Float f1 = new Float(d1);
		System.out.println(f1);// 100.0
		
		

	}
}
