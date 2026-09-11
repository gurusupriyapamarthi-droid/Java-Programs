package com.conditionalstatements;

import java.util.Scanner;

public class OnlineMarket {

	public static void main(String[] args) {
		double bankBalance=1000;
		char again='y';
		System.out.println("WELCOME TO ONLINE MARKETING");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENETR YOUR NAME  :");
		String username=sc.nextLine();
		System.out.println("your username is   :"+username);
		System.out.println();
		do{
			System.out.println("SELECT YOUR CHOICE  :");
		
		System.out.println();
		System.out.println("-->1.Vegetables");
		System.out.println("-->2.Fruits");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			do{
				System.out.println("YOUR CHOICE IS VEGETABLES  :");
			
			System.out.println();
			System.out.println("select your vegetables from below   :");
			char veg=sc.next().charAt(0);
			switch(veg) {
			case't':
				System.out.println("Tomato");
				int priceoft=20;
				System.out.println("price of your veg  :"+priceoft);
			break;
			case'p':
				System.out.println("Potato");
				int priceofp=30;
				System.out.println("price of your veg  :"+priceofp);
				break;
			case'o':
				System.out.println("Onion");
				int priceofo=40;
				System.out.println("price of your veg  :"+priceofo);
				break;
			case'c':
				System.out.println("Carrot");
				int priceofc=20;
				System.out.println("price of your veg  :"+priceofc);
				break;
			case'b':
				System.out.println("Brinjal");
				int priceofb=20;
				System.out.println("price of your veg  :"+priceofb);
				break;
				
			case'g':
				System.out.println("Green Chilli");
				int priceofg=10;
				System.out.println("price of your veg  :"+priceofg);
				break;
			default:
				System.out.println("your order is not vegetable");
			}
			System.out.println("DO YOU WANT TO ORDER AGAIN VEGETABLES   :Y/N: ");
			again = sc.next().charAt(0);
			}while(again=='y');
			System.out.println("your total vegetables price is    :");
		case 2:
		do {
			System.out.println("YOUR CHOICE IS FRUITS  :");
		
			System.out.println();
			System.out.println("select your fruita from below   :");
			char fru=sc.next().charAt(0);
			switch(fru) {
			case 'a':
				System.out.println("Apple");
				break;
			case 'b':
				System.out.println("Banana");
				break;
			case 'm':
				System.out.println("Mango");
				break;
			case 'o':
				System.out.println("Orange");
				break;
			case 'g':
				System.out.println("Grapes");
				break;
			case 'w':
				System.out.println("Watermelon");
				break;
			case 'p':
				System.out.println("Papaya");
				break;
			default:
				System.out.println("your order is not fruits");
			}
			System.out.println("DO YOU WANT TO ORDER AGAIN FRUITS   :Y/N:  ");
			again = sc.next().charAt(0);
			
		}while(again=='y');
						
		
		}
		System.out.println("DO YOU WANT TO ORDER AGAIN");
		
		}while(again=='y');
		

	}

}
