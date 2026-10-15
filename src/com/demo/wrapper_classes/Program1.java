package com.demo.wrapper_classes;

public class Program1 {
	public static void main(String[] args) {

		// int -> Integer Auto-boxing
		int a = 10;

		Integer aw1 = new Integer(a);
		System.out.println(aw1);// 10

		Integer aw2 = new Integer("1000");// 1000
		System.out.println(aw2 + 2000);// 3000

		// Integer -> int Un-boxing

		Integer aw3 = new Integer("3000");

		int b = aw3;
		System.out.println(b);// 3000

		int b2 = aw3 + 6000;
		System.out.println(b2);// 9000

		Integer aw4 = new Integer(5000);
		int b3 = aw4;
		System.out.println(b3);// 5000
		//

		Integer x = 1000;
		Integer y = 2000;// Integer y="2000" -> not allowed

		Integer res = x + y;
		System.out.println("res=" + res);

		int res2 = x + y;
		System.out.println("res=" + res2);

		Integer num1 = 100;
		Integer num2 = 100;
		System.out.println(num1 == num2);// true

		Integer num3 = 200;
		Integer num4 = 200;
		System.out.println(num3 == num4);// false

		Integer num5 = new Integer(100);
		Integer num6 = new Integer(100);
		System.out.println(num5 == num6);// false

		System.out.println(num5.equals(num6));// true

		Short num7 = 100;
		Integer num8 = 100;
		// System.out.println(num7 == num8); num7==num8 -> invalid
		System.out.println(num7.equals(num8));// false
		System.out.println(num7.intValue() == num8.intValue());// true

	}
}
