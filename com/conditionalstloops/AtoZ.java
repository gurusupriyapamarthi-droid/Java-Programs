package com.conditionalstloops;
import java.util.Scanner;

public class AtoZ {
	Scanner sc=new Scanner(System.in);
	 void Uppercase() {
		System.out.println("Uppercase Alphabets (A–Z)");
		System.out.println();
		System.out.println("ENETR A VALUE (65-90): ");
		int value=sc.nextInt();
		if(value>=65&&value<=90) {
			for(char c=(char)value;c<='Z';c++) {
				System.out.println(c);
			}
		}else {
			System.out.println("you entered invalid value");
		}
	}
	void Lowercase() {
		System.out.println("lower Alphabets (a-z)");
		System.out.println();
		System.out.println("ENETR A VALUE (97-122): ");
		int value=sc.nextInt();
		if(value>=97&&value<=122) {
			for(char c=(char)value;c<='z';c++) {
				System.out.println(c);
			}
		}else {
			System.out.println("you entered invalid value");
		}
	}
//	void alpha() {
//		System.out.println("enter a value  :");
//		int value=sc.nextInt();
//		if(value>0) {
//			for(int i=n;i>=0;i++) {
//				
//			}
//			
//		}
//	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char again='y';
		System.out.println("alphabet character ");
		System.out.println("-------------------");
		AtoZ obj=new AtoZ();
		System.out.println();
		do{
			System.out.println("-->1.uppercase alphabets");
		
		System.out.println("-->2.lowercase alphabets ");
		System.out.println();
		System.out.println("select your type");
		int type=sc.nextInt();
		switch(type) {
		case 1:
			obj.Uppercase();
			break;
		case 2:
			obj.Lowercase();
			break;
		default:
			System.out.println("your choice is not available");
		}
		System.out.println("DO YOU WANT TO SELECT AGAIN   Y/N");
		again=sc.next().charAt(0);

	}while(again=='y');
	}

}
