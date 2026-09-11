package com.constructors;

public class Bankcopy {
	int accountNo;
	String holderName;
	double balance;
	int Deposit;


	Bankcopy() {
		System.out.println("no arg constructor");
	}

	Bankcopy(int accountNo) {
		System.out.println("one arg constructor");
		this.accountNo = accountNo;
	}

	Bankcopy(Bankcopy b1, String holderName, double balance) {
		System.out.println("one arg constructor");
		this.accountNo = b1.accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}

	Bankcopy(Bankcopy b2, int Deposit) {
		
		this.accountNo = b2.accountNo;
		this.holderName = b2.holderName;
		this.Deposit = Deposit;
		this.balance = b2.balance;

	}
	Bankcopy(Bankcopy b1,Bankcopy b2,Bankcopy b3){
		this.accountNo = b1.accountNo;
		
		this.holderName = b2.holderName;
		this.balance = b2.balance;
		this.Deposit = b3.Deposit;
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Bankcopy b = new Bankcopy();
		b.out();

		Bankcopy b1 = new Bankcopy(2004);
		b1.out();

		Bankcopy b2 = new Bankcopy(b1, "supriya", 100000);
		b2.out();

		Bankcopy b3 = new Bankcopy(b2, 5000);
		b3.out();
		
		Bankcopy b4 = new Bankcopy(b1,b2,b3);
		b4.out();
	}

	void out() {
		System.out.println("Account number  :" + accountNo);
		System.out.println("name of the account holde   :" + holderName);
		System.out.println("remaining balance   :" + balance);
		System.out.println("ammaount Depodited   :" + Deposit);
		System.out.println("total bank balance   :" + (balance + Deposit));
		System.out.println();
	}

}
