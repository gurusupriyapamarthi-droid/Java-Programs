package com.conditionalstloops;

import java.util.Scanner;

public class Eventnum {
	Scanner sc=new Scanner(System.in);
	void factors() {
		System.out.println("enter 'n' value for factor data   :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n %i == 0) {
				System.out.println(i+" ");
			}	
		}
	}
	
		void even() {
		    System.out.println("Enter 'n' value for even numbers:");
		    int n = sc.nextInt();
		    for (int i = 1; i <= n; i++) {
		        if (i % 2 == 0) {
		            System.out.println(i);
		        }
		    }
		}
		void odd() {
			System.out.println("Enter 'n' value for odd numbers:");
		    int n = sc.nextInt();
		    for (int i = 1; i <= n; i++) {
		        if (i % 2 == 1) {
		            System.out.println(i);
		        }
		    }
		}
		void nthfactor() {
			System.out.println("enter 'n' value for nth factor data   :");
			int n=sc.nextInt();
			int count=0;
			for(int i=1;i<=50;i++) {
				if(n %i == 0) {
					System.out.println(i);
					count++;
					if(count==n) {
						System.out.println(i);
					}
					
					//System.out.println(i+" ");
				}	
			}
		}
		void perfectnum() {
			System.out.println("enter 'n'for perfect number  ");
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum=sum+i;
				
				}
			}if(sum==n) {
				System.out.println("is perfect numbe ");
			}else {
				System.out.println("not perfect number");
			}
		}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		System.out.println(" main method started");
		Eventnum obj=new Eventnum();
		obj.even();
		obj.odd();
		obj.factors();
		obj.nthfactor();
		obj.perfectnum();

	}

}
