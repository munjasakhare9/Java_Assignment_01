package com.demo.extra;

class Demo{
	public static void Demo() {
		System.out.println("Hello, from Demo Class..");
	}
}
public class Program1 {
	public static void main(String args[]) {
		Demo d=new Demo();
		Demo.Demo();
	}
}
