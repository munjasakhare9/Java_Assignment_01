package com.demo.wrapper_classes;

public class Program1 {
	public static void main(String[] args) {
		
		//int -> Integer Auto-boxing
		int a=10;
		
		Integer aw1=new Integer(a);
		System.out.println(aw1);//10
		
		Integer aw2=new Integer("1000");//1000
		System.out.println(aw2+2000);//3000
		
		//Integer -> int Un-boxing
		
		Integer aw3=new Integer("3000");
		
		int b=aw3;
		System.out.println(b);//3000
		
		int b2=aw3+6000;
		System.out.println(b2);//9000
		
		Integer aw4=new Integer(5000);
		int b3=aw4;
		System.out.println(b3);//5000
		//
	}
}
