package com.demo.wrapper_classes;

public class Program5 {
	public static void main(String[] args) {
		Long l1=new Long("1000");
		Long l2=new Long(1000l);
		System.out.println(l1.equals(l2));//true
		
		Long a=new Long(1000);
		Long b=new Long(1000);
		System.out.println(a.equals(b));//true
		
		Long m=100l;
		Long n=100L;
		System.out.println(m==n);//true
		
		Long num1=1000l;
		Long num2=1000L;
		System.out.println(num1==num2);//false
		
		long p=new Long(1000);
		System.out.println(p);//1000 -> unboxing
		
		Long obj = new Long(1000);
		long p1 = obj.longValue(); // Unboxing
		System.out.println(p1);    // 1000
	}
}
