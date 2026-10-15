package com.demo.wrapper_classes;

public class AutoBoxing {
	public static void main(String[] args) {
		int a = 10;
		Integer obj = Integer.valueOf(a);
		System.out.println(obj); // 10
		
		Boolean b = Boolean.valueOf("true");
		Double d = Double.valueOf("10.5");
		Long l = Long.valueOf("1000");
		long l2=1000;
		System.out.println(l==l2);//true
		
		
		
		
	}
}
