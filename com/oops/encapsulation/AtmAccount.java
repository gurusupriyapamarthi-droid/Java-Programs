package com.oops.encapsulation;

import java.util.Scanner;

public class AtmAccount {
	Scanner sc=new Scanner(System.in);
	double Balance=10000.00;
	void Deposit() {
		System.out.println("how much amount you want to deposite   :");
		double deposite=sc.nextDouble();
		if(deposite>0) {
		System.out.println("your deposited amount is   :"+deposite);
		System.out.println();
		Balance+=deposite;
		System.out.println("total amount in ur acount  :"+Balance);
	}else {
		System.out.println("deposite must be >than 0");
	}
	}
	void withDraw() {
		System.out.println("enter withdrawl amount  :");
		double withdraw=sc.nextDouble();
		if(withdraw>500) {
		Balance-=withdraw;
		System.out.println("remaining amount is   :"+Balance);	
	}
		else {
			System.out.println("deposite must be >than 0");
		}
	}
	void Bankbalance() {
		System.out.println("your current bank balance is   :"+Balance);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("------------ATM-----------");
		AtmAccount a=new AtmAccount();
		a.Deposit();
		System.out.println("------------------------------");
		a.withDraw();
		System.out.println("---------------------------------");
		a.Bankbalance();
		
	}
	private double balance;
	public void setBal( double balance ) {
		this.balance=balance;
	}
	public double getBal() {
		return  balance;
	}

}
