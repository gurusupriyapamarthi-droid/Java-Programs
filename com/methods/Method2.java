package com.methods;

import java.util.Scanner;

public class Method2 {
	Scanner sc=new Scanner(System.in);
	
	void myClg() {
		String name;
		System.out.println("enter name of the college:");
		String name1=sc.nextLine();
		
		System.out.println("my college name is"+name1);
	}
	
	void myBranch() {
		String name;
		System.out.println("enter your branch:");
		String name1=sc.nextLine();
		System.out.println("my branch name is:"+name1);
	}
	
	void myCgpa() {
		Float cgpa;
		System.out.println("enter your cgpa:");
		Float cgpa1=sc.nextFloat();
		System.out.println("my total CGPA is :"+cgpa1);
				
	}
	void myinter() {
		int inter;
		System.out.println("enter your inter marks:");
		int inter1=sc.nextInt();
		System.out.println("my inter marks is:"+inter1);
	}
	void my10th() {
		int marks;
		System.out.println("enter your 10th marks:");
		int marks1=sc.nextInt();
		System.out.println("my 10th marks is :"+marks1);
	}
	void year() {
		short passed;
		System.out.println("enter your year of passed out:");
		short passed1=sc.nextShort();
		String name1=sc.nextLine();
		System.out.println("btech year of passed:"+ passed1);
		
	}
	void interclg() {
		String name;
		System.out.println("enter your inter college name:");
		String name1=sc.nextLine();
		System.out.println("my inter college name is:"+name1);
	}
	void school() {
		String name;
		System.out.println("enter your school name :");
		String name1=sc.nextLine();
		System.out.println("my school name is:"+name1);
		
	}
	void institute() {
		String name;
		System.out.println("enter your  institute :");
		String name1=sc.nextLine();
		System.out.println("my institute name is:"+name1);
	}
	void course() {
		String name;
		System.out.println("enter your course name  :");
		String name1=sc.nextLine();
		System.out.println("my course name is:"+name1);
	}

	public static void main(String[] args) {
		System.out.println("no return type + no arguments using scanner");
		System.out.println("*********************************************");
		
		Method2 obj2=new Method2();
		obj2.myClg();
		obj2.myBranch();
		obj2.myCgpa();
		obj2.myinter();
		obj2.my10th();
		obj2.year();
		obj2.interclg();
		obj2.school();
		obj2.institute();
		obj2.course();
		

	}

}
