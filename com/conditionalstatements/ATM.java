package com.conditionalstatements;
//ATM Cash Withdrawal:
//Write a Java program to simulate an ATM system.
//Verify the PIN, check the daily withdrawal limit and 
//account balance,
//then perform the withdrawal using nested if statements
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		System.out.println("welcome to ATM");
		System.out.println("--------------------");
		char choice;
		
		int correctpin=4444;
		double accountBalance=10000.00;
		double limit=3000;
		
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("enter your pin   :");
			int pin =sc.nextInt();
			if(pin==correctpin) {
				System.out.println("succesfully pin entered");
				System.out.println();
				System.out.println("enter withdrawl amount....:");
				double withdraw=sc.nextDouble();
				if(withdraw<=limit) {
					System.out.println("withdrwal amount is   :"+withdraw );
					System.out.println();
					if(withdraw <=accountBalance) {
						System.out.println("withdrawl completed");
						accountBalance-=withdraw;
						System.out.println();
						System.out.println("remaining amount is   :"+accountBalance);
						System.out.println();
						limit-=withdraw;
						System.out.println("remaining limit    "+limit);
						
					}else {
						System.out.println("insufficient balance");
					}
				}else {
				System.out.println("outof limit");
				System.out.println();
				
				limit-=withdraw;
				System.out.println("remaining limit    "+limit);
				System.out.println("remaining amount is   :"+accountBalance);
				}
			}else {
				System.out.println("incorrect pin");
			}
			 System.out.println("Do you want to continue? (Y/N)");
			   choice = sc.next().charAt(0);
		
		}while(choice=='y');
		
		System.out.println("THANK YOU");
	}
	}
	

	
		
	


