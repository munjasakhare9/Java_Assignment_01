package com.demo.player;

public class Driver {
	void print(Player p) {
		System.out.println(p.id+" -- "+p.name+" -- "+p.age);
	}
	public static void main(String args[]) {
		Driver d=new Driver();
		Player p=new Player();
		p.id=101;
		p.name="raj";
		p.age=21;
		
		d.print(p);
	}
}
