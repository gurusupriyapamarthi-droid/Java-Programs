package com.identifier;

public class StudentInfo {
	int rollNo;
	String name;
	byte age;
	char gender;
	char section;
	static int marks;

	float percentage;
	static boolean status;

	public static void main(String[] args) {
		StudentInfo t1=new StudentInfo ();
		t1.rollNo=6065;
		t1.name="supriya";
		t1.age=22;
		t1.gender='f';
		t1.section='A';
		t1.marks=500;
		t1.status=false;
		
		
		int sub1=90;
		int sub2=93;
		int sub3=95;
		int sub4=97;
		int sub5=99;
		int totalmarks=sub1 + sub2 + sub3 + sub4 + sub5;
		t1.percentage=(totalmarks*100)/marks;
		
		
		System.out.println("main method start: ");
		if(totalmarks<500) {
			//status=true;
			
			System.out.println("pass");
		}
		
		System.out.println();
		System.out.println("student rollnumber"+" "+t1.rollNo);
		System.out.println("student name "+" "+t1. name);
		System.out.println("student age "+" "+t1.age);
		System.out.println("student gender"+" "+t1.gender);
		System.out.println("student section"+" "+t1.section);
		System.out.println("total subject marks:"+" "+totalmarks);
		System.out.println("percentage of the student:"+" "+t1.percentage);
		System.out.println(t1.status);
		
		

	}

}
