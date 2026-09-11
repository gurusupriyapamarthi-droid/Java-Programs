package com.patterns;

public class Pyramid {
	static boolean pattern() {
		for(int i=1;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}	
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return true;
	}
	static void pattern1() {
		for(int i=1;i<6;i++) {
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
			}
			for(int j=9;j>=2*i-1;j--) {
				System.out.print("*");
			}
			
			System.out.println();
			}
		
		}
	static void patternEven() {
		for(int i=1;i<6;i++) {
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
			}
			for(int j=7;j>=2*i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("------Pyramid---------");
		for (int i = 1; i <=12; i++) {
			if(i%2==1) {
			for (int j = 1; j > 0; j--) {
				System.out.print("*");	
				
			}
	
			System.out.println();
		}
//			else {
//				System.out.print(" ");
//			}
	}
		System.out.println("----------------------------");
		
		//pattern();
		
		//pattern1();
		patternEven();
		
}
}

