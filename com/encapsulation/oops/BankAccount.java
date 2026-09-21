package com.encapsulation.oops;

public class BankAccount {
	private double balance;
	
	public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited   :"+balance);
        } else {
            System.out.println("Invalid amount    "+amount);
        }
    }
	 public void withdraw(double amount) {

	        if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Amount withdrawn    :"+amount);
	        } else {
	            System.out.println("Insufficient balance or invalid amount");
	        }
	    }
	 public double getBalance() {
		 return balance;
	 }
}
