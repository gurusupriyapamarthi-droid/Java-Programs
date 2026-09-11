package com.javaprograms;

import java.util.Scanner;

public class Test1 {
	void CalculateBill() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.nextLine();
		
		
		System.out.println("enter units consumed:" );
		int Consumed=sc.nextInt();
		
		
		System.out.println("enter unitd");
		int units=sc.nextInt();
		sc.nextLine();
		int  bill=Consumed*units;
		
		
		//System.out.println("total bill");
		//int  bill=sc.nextInt();
		
		System.out.println("enter name:"+name);
		System.out.println("enter consumed:"+Consumed);
		System.out.println("enter units:"+units);
		
		System.out.println("total bill:"+bill);
		
		//System.out.println("total bill");
		
		
//		Scanner sc=new Scanner(System.in);
//System.out.println("enter name:"+name);
		//System.out.println("enter units consumed:"+Consumed );
//		System.err.println("enter unitd"+units);
//		System.out.println("total bill"+Consumed*units);
		
		
	}
	 void main() {
		 CalculateBill();
		 
	}

}
