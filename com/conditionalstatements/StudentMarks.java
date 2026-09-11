package com.conditionalstatements;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		System.out.println("Student marks ");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name of the student.....:");
		String sName=sc.nextLine();
		
		System.out.println("enter class...:");
		int cls=sc.nextInt();
		
		System.out.println("enter marks of the student...:");
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("A grade");
			System.out.println();
			
		
		}else if(marks>=80){
			System.out.println("B grade");
		}else if(marks>=70) {
			System.out.println("C grade");
		}else if(marks>=60) {
			System.out.println("D grade");
		}else {
			System.out.println("your failed");
		}
			
	}

}
