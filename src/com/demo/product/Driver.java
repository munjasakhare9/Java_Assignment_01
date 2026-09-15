package com.demo.product;

public class Driver {
	void print(Product p) {
		System.out.println(p.pid+" -- "+p.pname+" -- "+p.price);
	}
	public static void main(String args[]) {
		Driver d=new Driver();
		Product p=new Product();
		p.pid=101;
		p.pname="mouse";
		p.price=140.0;
		
		d.print(p);
		
	}
}
