package com.demo.main;

public class Driver {
	
	public void print(Employee e1) {
		System.out.println(e1.id+" -- "+e1.salary);
	}
	public static void main(String args[]) {
		
		Driver d1=new Driver();
		Employee e1=new Employee();
		e1.id=101;
		e1.salary=150000.0;
		
		d1.print(e1);
	}
}
