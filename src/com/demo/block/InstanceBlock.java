package com.demo.block;
public class InstanceBlock {
	public int a=10;
	public static int b=20;

	{
		System.out.println("i am from instance block"+" a="+a+" b="+b);
	}

	public InstanceBlock() {
		System.out.println("I am from constructor"+" a="+a+" b="+b);
	}

	static {
		InstanceBlock ib=new InstanceBlock();
		System.out.println("I am from static block"+" a="+ib.a+" b="+b);
	}

	public static void main(String[] args) {
		System.out.println("i am from main method...");
		InstanceBlock d = new InstanceBlock();
	}
}