package com.exceptionhandling;

import java.util.Scanner;

public class PassengerDetails {

	private static final String String = null;

	public static void main(String[] args) {
		System.out.println(" ----------passenger booking---------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter passenger details  :id  +age  +seatnumber");
		String pid=sc.next();
		String age=sc.next();
		String seatnumber=sc.next();
		try {
			int id=Integer.parseInt( pid);
		}catch(NumberFormatException ne) {
			
		}

	}

}
