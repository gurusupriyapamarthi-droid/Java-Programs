package com.operators;
import java.util.Scanner;
public class Timeconversion {
	    public static void main(String[] args) {
	    	System.out.println("main method started.....");

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter total seconds: ");
	        int totalSeconds = sc.nextInt();

	        int hours = totalSeconds / 3600;
	        int minutes = (totalSeconds % 3600) / 60;
	        int seconds = totalSeconds % 60;

	        System.out.println("Hours   : " + hours);
	        System.out.println("Minutes : " + minutes);
	        System.out.println("Seconds : " + seconds);

	        sc.close();
	        System.out.println("main method ended.....");
	    }
	}

