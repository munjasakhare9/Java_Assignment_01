package com.demo.wrapper_classes;

public class Program8 {
	public static void main(String[] args) {
		int a = 10;
		Integer p = new Integer(a); // boxing using constructor
		Integer q = Integer.valueOf(a);// boxing using valueOf()
		System.out.println(p);
		System.out.println(q);
		String b = "120";
		Integer x = new Integer(b); // boxing using constructor
		Integer y = Integer.valueOf(b); // boxing using valueOf()
		System.out.println(x);
		System.out.println(y);
		
		int b1=10;
		Integer b12=new Integer(b);
		Integer b13=new Integer(b);
		System.out.println(b12==b13);//false
		
		Integer b14=Integer.valueOf(b1);
		Integer b15=Integer.valueOf(b1);
		System.out.println(b14==b15);//true
	}
}
