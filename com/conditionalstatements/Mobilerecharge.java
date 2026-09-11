package com.conditionalstatements;

import java.util.Scanner;

public class Mobilerecharge {

	public static void main(String[] args) {
		System.out.println("----mobile recharge plans----");
		Scanner sc=new Scanner(System.in);
		String nextPlan;
		double availableBalance=600;
		
			System.out.println("Available Recharge Plans");
	        System.out.println("1. Rs.199");
	        System.out.println("2. Rs.399");
	        System.out.println("3. Rs.599");

	        System.out.print("Enter Recharge Amount: ");
	        int recharge = sc.nextInt();
	        if(recharge==199 || recharge==399 || recharge ==599) {
	        	
	        		System.out.println("recharge succesfully");
	        		System.out.println("remaining amount   :"+(availableBalance-recharge));
	        		   if (availableBalance >= recharge) {
	        			   availableBalance =  - recharge;
	        }else {
	        	System.out.println("insufficient balance");
	        }
	        

		}

}
}
