package com.demo.wrapper_classes;

public class Program4 {
	public static void main(String[] args) {
		Byte a = new Byte((byte) 100);
		Byte b = new Byte("100");

		System.out.println(a.equals(b));// true

		Byte x = 100;
		Byte y = 100;
		System.out.println(x == y);// true

		Byte m = (byte) 128;// -127
		Byte n = (byte) 128;// -127
		System.out.println(m == n);// true

		Byte p = (byte) 1000;// -24 1000 % 256=232 -> 232-256=-24
		Byte q = (byte) 1000;// -24
		System.out.println(p == q);// true

		Byte num1 = (byte) 1000;
		Byte num2 = -24;
		System.out.println(num1 == num2);//true

	}
}
