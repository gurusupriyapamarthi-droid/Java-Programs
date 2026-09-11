package com.project;

import java.util.Scanner;

public class OnlineMarket2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double bankBalance = 3000;
		int totalBill = 0;
		char menuAgain = 'y';

		System.out.println("=================================");
		System.out.println("WELCOME TO ONLINE MARKET");
		System.out.println("=================================");

		System.out.print("Enter Your Name : ");
		String userName = sc.nextLine();

		System.out.println("Welcome " + userName);

		do {

			System.out.println();
			System.out.println("Select Category");
			System.out.println("1. Vegetables");
			System.out.println("2. Fruits");
			System.out.print("Enter Choice : ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				char vegAgain;

				do {

					System.out.println();
					System.out.println("Vegetables");
					System.out.println("t - Tomato      ₹20");
					System.out.println("p - Potato      ₹30");
					System.out.println("o - Onion       ₹40");
					System.out.println("c - Carrot      ₹20");
					System.out.println("b - Brinjal     ₹25");
					System.out.println("g - Green Chilli ₹10");
 
					System.out.print("Enter Vegetable : ");
					char veg = sc.next().charAt(0);

					switch (veg) {

					case 't':
						System.out.println("Tomato Added");
						totalBill += 20;
						break;

					case 'p':
						System.out.println("Potato Added");
						totalBill += 30;
						break;

					case 'o':
						System.out.println("Onion Added");
						totalBill += 40;
						break;

					case 'c':
						System.out.println("Carrot Added");
						totalBill += 20;
						break;

					case 'b':
						System.out.println("Brinjal Added");
						totalBill += 25;
						break;

					case 'g':
						System.out.println("Green Chilli Added");
						totalBill += 10;
						break;

					default:
						System.out.println("Invalid Vegetable");
					}

					System.out.println("Current Bill : ₹" + totalBill);

					System.out.print("Order More Vegetables? (y/n): ");
					vegAgain = sc.next().charAt(0);

				} while (vegAgain == 'y' || vegAgain == 'Y');

				break;

			case 2:

				char fruitAgain;

				do {

					System.out.println();
					System.out.println("Fruits");
					System.out.println("a - Apple      ₹120");
					System.out.println("b - Banana     ₹50");
					System.out.println("m - Mango      ₹80");
					System.out.println("o - Orange     ₹60");
					System.out.println("g - Grapes     ₹90");
					System.out.println("w - Watermelon ₹70");
					System.out.println("p - Papaya     ₹55");

					System.out.print("Enter Fruit : ");
					char fruit = sc.next().charAt(0);

					switch (fruit) {

					case 'a':
						System.out.println("Apple Added");
						totalBill += 120;
						break;

					case 'b':
						System.out.println("Banana Added");
						totalBill += 50;
						break;

					case 'm':
						System.out.println("Mango Added");
						totalBill += 80;
						break;

					case 'o':
						System.out.println("Orange Added");
						totalBill += 60;
						break;

					case 'g':
						System.out.println("Grapes Added");
						totalBill += 90;
						break;

					case 'w':
						System.out.println("Watermelon Added");
						totalBill += 70;
						break;

					case 'p':
						System.out.println("Papaya Added");
						totalBill += 55;
						break;

					default:
						System.out.println("Invalid Fruit");
					}

					System.out.println("Current Bill : ₹" + totalBill);

					System.out.print("Order More Fruits? (y/n): ");
					fruitAgain = sc.next().charAt(0);

				} while (fruitAgain == 'y' || fruitAgain == 'Y');

				break;

			default:
				System.out.println("Invalid Choice");
			}

			System.out.print("Do You Want to Continue Shopping? (y/n): ");
			menuAgain = sc.next().charAt(0);

		} while (menuAgain == 'y' || menuAgain == 'Y');

		System.out.println();
		System.out.println("========== BILL ==========");
		System.out.println("Items Total : ₹" + totalBill);

		int deliveryCharge;

		if (totalBill >= 2000) {
			deliveryCharge = 0;
			System.out.println("Delivery Charge : FREE");
		} else {
			deliveryCharge = 50;
			System.out.println("Delivery Charge : ₹50");
		}

		int finalBill = totalBill + deliveryCharge;

		System.out.println("Final Bill : ₹" + finalBill);

		if (bankBalance >= finalBill) {
			bankBalance = bankBalance - finalBill;
			System.out.println("Order Placed Successfully.");
			System.out.println("Remaining Wallet Balance : ₹" + bankBalance);
		} else {
			System.out.println("Insufficient Wallet Balance.");
			System.out.println("Wallet Balance : ₹" + bankBalance);
			System.out.println("==========THANK YOU==========");
		}

		sc.close();
	}
}
