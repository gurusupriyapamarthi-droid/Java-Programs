package com.identifier;

public class Bank {
	static int account = 1001;
	String name;
	int balance;
	{
		account++;
	}

	void method() {
		System.out.println("Account number:" + account);
		System.out.println("Account name:" + name);
		System.out.println("Account balance:" + balance);
		System.out.println();
	}

	public static void main(String[] args) {
		Bank a = new Bank();
		 account = 1001;
		a.name = "supriya";
		a.balance = 20000;
		a.method();
		
		Bank b = new Bank();
		b.name = "valli";
		b.balance = 30000;
		b.method();
		
		Bank c = new Bank();
		c.name = "gani";
		c.balance = 22000;
		c.method();
		
		Bank d = new Bank();
		d.name = "priya";
		d.balance = 40000;
		d.method();

	}
}
