package com.conditionalstatements;

import java.util.Scanner;

public class ATMbank {

	public static void main(String[] args) {
		System.out.println("welcome to ATM ");
		System.out.println("--------------------");
		char again = 'y';
		int correctpin=4444;
		double accountBalance=10000.00;
		double limit=3000;
		
		
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enetr your ATM pn");
		
			do {
				System.out.println("Enetr your ATM pn");
				int pin =sc.nextInt();
				if(pin==correctpin) {
					System.out.println("succesfully pin entered");
					System.out.println();
				System.out.println("ENTER YOUR CHOICE ");
				System.out.println("  -->1.  DEPOSITE");
				System.out.println("  -->2.WITHDWARL");
				System.out.println("  -->3.CHECK BANK BALANCE");
				System.out.println();
				int choice=sc.nextInt();
				switch(choice) {
				case 1:System.out.println("your choice is  DEPOSITE method");
				System.out.println();
				System.out.println("how much amount you want to deposite   :");
				double deposite=sc.nextDouble();
				System.out.println("your deposited amount is   :"+deposite);
				System.out.println();
				accountBalance+=deposite;
				System.out.println("total amount in ur acount  :"+accountBalance);
				break;
				case 2:
					System.out.println("your choice is  WITHDWARL method ");
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
					break;

				case 3:System.out.println("your choice is  CHECK BANK BALANCE method ");
				System.out.println();
				System.out.println("your current bank balance is   :"+accountBalance);
				break;
				default:System.out.println("your choice is invalid");
				}
				System.out.println("DO YOU WANT TO CONTINUW   Y/N  :");
				again = sc.next().charAt(0);
				
			}else {
				System.out.println("incorrect pin");
				System.out.println("THANK YOU");
				 
			}
				
			}while(again=='y');
			
	}
	

}
