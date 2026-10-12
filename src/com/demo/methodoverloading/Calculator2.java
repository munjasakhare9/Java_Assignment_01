package com.demo.methodoverloading;

public class Calculator2 {
	
	void add (int i, int j, int... ks) {
		int sum=i + j;
		
		for(int k:ks) {
			sum+=k;
		}
		System.out.println("Sum from 1st method :" + sum);
	}

	void add (int i, int j, int k) {
		System.out.println("Sum from 2nd method : " + (i + j + k));
	}

	public static void main(String[] args) {
		Calculator2 c = new Calculator2();
		
		c.add(10, 20);
		c.add(10, 20, 30);

		c.add(10, 20, 30, 40);   // invalid
		
		c.add(10, 20, new int[] {100,200,300,400,500});
	}
}
