package com.demo.encapsulation;

public class Test {

	public static void main(String[] args) {

		Account obj = new Account(); // obj creation
		obj.setAccNum(797979);
		obj.setName("Ashok");

		int accNum = obj.getAccNum();
		String name = obj.getName();

		System.out.println(accNum + "--" + name);
	}
}
