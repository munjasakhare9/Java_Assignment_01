package com.demo.methodoverloading;

public class Calculator3 {

	void add(int i, int... ks) {
		int sum = i;

		for (int k : ks) {
			sum += k;
		}
		System.out.println("Sum from 1st method :" + sum);
	}

	public static void main(String[] args) {
		Calculator3 c = new Calculator3();

		c.add(10, 20);
		c.add(20, 50, 60, 10);
		c.add(10, new int[] { 10, 20, 30, 40, 50, 60 });
	}
}
