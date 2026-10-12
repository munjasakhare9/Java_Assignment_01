package com.demo.interface_ex;

public class HdfcBank implements Bank {

	public void moneyTransfer() {
		System.out.println("Money Transfer from HDFC....");
	}

	public void checkBalance() {
		System.out.println("Checking Balance from HDFC.....");
	}
}