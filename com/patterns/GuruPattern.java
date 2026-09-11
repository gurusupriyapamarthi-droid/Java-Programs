package com.patterns;

public class GuruPattern {
	static void gPattern() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==2&&j==2)||(i==2&&j==3)||(i==2&&j==4)||(i==2&&j==5)||(i==3&&j==2)||(i==4&&j==2)||(i==4&&j==4)||(i==5&&j==4)) {
				System.out.print(" ");	
				}else {
				System.out.print("*");
			}
			}
			System.out.println();	
		}
	}
	static void uPattern() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 ||i==n||j==n) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		System.out.println("-----G---------");
		gPattern();
		System.out.println("-------------------");
		uPattern();
		System.out.println("-----------------");
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
					System.out.print("*");	
			}
			System.out.println();	
		}
	}
}
