package com.conditionalstatements;

import java.util.Scanner;

public class IcecreamShop {
	Scanner sc=new Scanner(System.in);
	double bankBalance = 3000;
	int totalBill = 0;
	char menuAgain = 'y';
	

	void iceCream() {
		System.out.println("Select ICE-CREAM flavour");
		System.out.println();
		System.out.println("v-->Vanilla");
		System.out.println("c-->Chocolate");
		System.out.println("s-->Strawberry");
		System.out.println("b-->Butterscotch");
		System.out.println("m-->Mango");
		System.out.println("k-->Black Currant");
		char iceF=sc.next().charAt(0);
		switch(iceF) {
		case 'v':
			System.out.println("Vanilla");
			totalBill+=200;
			break;
		case'c':
			System.out.println("Chocolate");
			totalBill+=250;
			break;
		case 's':
			System.out.println("Strawberry");
			totalBill+=230;
			break;
		case 'b':
			System.out.println("Butterscotch");
			totalBill+=300;
			break;
		case 'm':
			System.out.println("Mango");
			totalBill+=150;
			break;
		case 'k':
			System.out.println("Black Currant");
			totalBill+=300;
			break;
		default:
			System.out.println("we dont have that ice-cream flavour");
		}
		
	}
	void cakeF() {
		System.out.println("Select CAKE flavour");
		System.out.println();
		System.out.println("v-->Vanilla");
		System.out.println("c-->Chocolate");
		System.out.println("s-->Strawberry");
		System.out.println("b-->Butterscotch");
		System.out.println("m-->Mango");
		System.out.println("k-->Black Currant");
		char cakeF=sc.next().charAt(0);
		switch(cakeF) {
		case 'v':
			System.out.println("Vanilla");
			totalBill+=400;
			break;
		case'c':
			System.out.println("Chocolate");
			totalBill+=500;
			break;
		case 's':
			System.out.println("Strawberry");
			totalBill+=300;
			break;
		case 'b':
			System.out.println("Butterscotch");
			totalBill+=500;
			break;
		case 'm':
			System.out.println("Mango");
			totalBill+=300;
			break;
		case 'k':
			System.out.println("Black Currant");
			totalBill+=500;
			break;
		default:
			System.out.println("we dont have that cake flavour");
		}
		
	}
	void milkshake() {
		System.out.println("Select MILKSHAKE flavour");
		System.out.println();
		System.out.println("v-->Vanilla");
		System.out.println("c-->Chocolate");
		System.out.println("s-->Strawberry");
		System.out.println("b-->Butterscotch");
		System.out.println("m-->Mango");
		System.out.println("k-->Black Currant");
		char msF=sc.next().charAt(0);
		switch(msF) {
		case 'v':
			System.out.println("Vanilla");
			totalBill+=100;
			break;
		case'c':
			System.out.println("Chocolate");
			totalBill+=150;
			break;
		case 's':
			System.out.println("Strawberry");
			totalBill+=120;
			break;
		case 'b':
			System.out.println("Butterscotch");
			totalBill+=200;
			break;
		case 'm':
			System.out.println("Mango");
			totalBill+=120;
			break;
		case 'k':
			System.out.println("Black Currant");
			totalBill+=200;
			break;
		default:
			System.out.println("we dont have that milkshake flavour");
		}
		
		
	}

	public static void main(String[] args) {
		double bankBalance = 3000;
		int totalBill = 0;
		char menuAgain = 'y';
		IcecreamShop obj=new IcecreamShop();
		

		System.out.println("--------------------------------");
		System.out.println("   WELCOME TO ICE-CREAM SHOP    ");
		System.out.println("---------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println(" may i know your name plz   :");
		String name =sc.nextLine();
		System.out.println();
		do {
			System.out.println();
			System.out.println("WHAT YOU WANT TO ORDER");
			System.out.println();
			System.out.println("--> 1.ICE-CREAM");
			System.out.println("--> 2.CAKES");
			System.out.println("--> 3.MILKSHAKES");
			int order=sc.nextInt();
			System.out.println();
			switch(order) {
			case 1:
				char icecream;
				do {
					obj.iceCream();
					System.out.println("DO YOU WANT SOME MORE ICE-CREAMS  Y/N  :");
					 icecream=sc.next().charAt(0);
				}while(icecream=='y'||icecream=='Y');
			break;
			case 2:
				char cake;
				do {
					obj.cakeF();
					System.out.println("DO YOU WANT SOME MORE CAKES  Y/N  :");
					cake =sc.next().charAt(0);
					
				}while(cake=='y'||cake=='Y');
				break;
			case 3:
				char milks;
				do {
					obj.milkshake();
					System.out.println("DO YOU WANT SOME MORE MILKSHAKES  Y/N  :");
					milks=sc.next().charAt(0);
				}while(milks=='y'||milks=='Y');
				break;
			default:
				System.out.println("YOUR ORDER IS NOT AVAILABLE IN THIS SHOP");
			}
			
			
		}while(menuAgain =='y'|| menuAgain == 'Y');
		System.out.println();
		System.out.println("========== BILL ==========");
		System.out.println("Items Total : ₹" + totalBill);

	}

}
