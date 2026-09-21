package com.encapsulation.oops;

public class DepositandWithdraw {

	public static void main(String[] args) {
		System.out.println("------Deposit and Withdraw------");
		BankAccount b=new BankAccount();
		b.deposit(10000);
		System.out.println("After deposite  :"+b.getBalance());
		b.withdraw(500);
		System.out.println(b.getBalance());
	}

}
