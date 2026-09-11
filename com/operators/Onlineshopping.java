package com.operators;

public class Onlineshopping {

	public static void main(String[] args) {
		double orderAmount=450;
		System.out.println("customer is eligible  for free delivery  :"+(orderAmount>=499));
		int collegeAdmission=79;
		System.out.println("student is eligible for admission    :"+(collegeAdmission>=75));
		int ages=10;
		System.out.println("A child ticket is available for ages below    :"+(ages>=12));
		double bankAccount=500;
		System.out.println("a minimum balance of 1000 is required   :"+(bankAccount>=1000));

	}

}
