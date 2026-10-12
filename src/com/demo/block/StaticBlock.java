package com.demo.block;

public class StaticBlock {
	public static int a = 10;
	int b=20;
	void show() {
		System.out.println("show method called");
	}
	public static void display() {
		StaticBlock s=new StaticBlock();
		System.out.println("static method a=" + a+" b="+s.b);
		s.show();
	}

	static {
		StaticBlock s=new StaticBlock();
		System.out.println("static block a=" + a+" b="+s.b);
		s.show();

	}

	public static void main(String[] args) {
		display();
		System.out.println("main method");
	}
}
