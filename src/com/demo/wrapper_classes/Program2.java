package com.demo.wrapper_classes;

public class Program2 {
	public static void main(String[] args) {
		short a=10;
		Short aw1=new Short(a);
		System.out.println(aw1);
		
		Short aw2=new Short("2000");
		System.out.println(aw2);
		
		short b=aw2;
		System.out.println(b);
		System.out.println(b+5000);
	}
}
