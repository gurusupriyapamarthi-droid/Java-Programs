package com.conditionalstatements;

import java.util.Scanner;
//Verify user login.
//Check whether the product is in stock.
//Check if the wallet/account balance is sufficient.
//Place the order.

public class Onlineshopping {
	

	public static void main(String[] args) {
		System.out.println("WELCOME TO ONLINE SHOPPIN");
		System.out.println("------------------------------");
		Scanner sc=new Scanner(System.in);
		String userName="SUPRIYA";
		int loginID=4321;
		double accountBalance=20000.00;
		boolean product=true;
		double productPrice=2000;
		
		
		System.out.println("Enter your username");
		String Name=sc.nextLine();
		if(Name.equals(userName)) {
			System.out.println("Enter your loginid");
			int id=sc.nextInt();
		 if((Name.equals(userName))&&(id==loginID)) {
			System.out.println("YOUR ONLINE SHOPPING ACCOUNT LOGIN COMPLETED");
			System.out.println("--------------------------------------------------");
			System.out.println();
			System.out.println("is your product is there ");
			//boolean pro=sc.hasNext();
			if(product) {
				
				System.out.println("Your product is available");
				System.out.println();
				
				  if ( accountBalance>= productPrice) {
					  
	                    System.out.println("Order Placed Successfully");
	                    System.out.println();
	                    accountBalance = accountBalance - productPrice;

	                    System.out.println("Product Price : ₹" + productPrice);
	                    System.out.println();
	                    System.out.println("Remaining Wallet Balance : ₹" + accountBalance);
				
			}else{
				System.out.println("Your search product is not available");
			}
				  
			}else {
				System.out.println("check your product again");
			}
		}
	}else {
		System.out.println("invalid username   :");
	}
	}
}

	


