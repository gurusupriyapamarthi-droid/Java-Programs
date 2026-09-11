package com.oops.encapsulation;

public class Atm2 {

	public static void main(String[] args) {
		AtmAccount a1=new AtmAccount();
		System.out.println("-------------------");
		//a1.Deposit();
		System.out.println("------------------------------");
		//a1.withDraw();
		System.out.println("---------------------------------");
		//a1.Bankbalance();
		//System.out.println(a1.Balance);
		a1.setBal(10000.00);
		System.out.println(a1.getBal());

	}

}
