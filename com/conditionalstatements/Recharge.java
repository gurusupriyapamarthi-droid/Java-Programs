package com.conditionalstatements;

import java.util.Scanner;

public class Recharge {

	public static void main(String[] args) {
		System.out.println("-----mobile recharge plans-----");
		Scanner sc=new Scanner(System.in);
		String nextPlan;
		double availableBalance=600;
		
		do {
			System.out.println("Available Recharge Plans");
			
			 int recharge = sc.nextInt();
			 switch(recharge) {
			 case 199:
				 System.out.println("your recharge plan is 199");
				 System.out.println("recharge succesfully");
				 System.out.println("remaining balance in your account is   :"+(availableBalance-recharge));
				 break;
			 case 399:
				 System.out.println("your recharge plan is 399");
				 System.out.println("recharge succesfully");
				 System.out.println("remaining balance in your account is   :"+(availableBalance-recharge));
				 break;
			 case 599:
				 System.out.println("your recharge plan is 599");
				 System.out.println("recharge succesfully");
				 System.out.println("remaining balance in your account is   :"+(availableBalance-recharge));
				 break;
			 default:
		            System.out.println("Invalid Recharge Plan");
		    }
			 
		 
			 System.out.println("do you want to recharge again");
			 nextPlan = sc.next();

	}while(nextPlan.equalsIgnoreCase("yes"));
	

}
}
