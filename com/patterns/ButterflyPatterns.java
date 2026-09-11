package com.patterns;

public class ButterflyPatterns {
	static void firstHalf() {
		for(int i=1;i<=6;i++) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
				
			}
			for(int j=5;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	static void secondHalf() {
		for(int i=1;i<7;i++) {
			for(int j=6;j>i;j--) {
				System.out.print("*");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=6;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		System.out.println("---------ButterFly------------");
		firstHalf();
		secondHalf();

	}

}
