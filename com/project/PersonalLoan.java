package com.project;

import java.util.Scanner;

class PersonalLoane extends Loan {
	 Scanner sc=new Scanner(System.in);
	 double getROI(int cibil) {
		 int roi=0;
		 if(cibil >=300&&cibil<=599) {
			roi=15; 
		 }else if(cibil >=600&&cibil<=649) {
			 roi=13;
		 }else if(cibil >=650&&cibil<=699) {
			 roi=11;
		 }else if(cibil >=700&&cibil<=749) {
			 roi=10;
		 }else if(cibil >=750&&cibil<=900) {
			 roi=0;
		 }
		 return roi;
	 }
	public static void main(String[] args) {
		System.out.println("--------Wellcome Personal Loan Application-----------");
		Scanner sc=new Scanner(System.in);
		Loan l=new PersonalLoane();
		System.out.println("Enetr Customer Name");
		l.getName(sc.next());
		System.out.println("Enetr Customer Age");
		l.getAge(sc.nextInt());
		System.out.println("Enetr Customer Phone Number");
		l.getPhone(sc.next());
		System.out.println("Enetr Customer PAN Number");
		l.getPan(sc.next());
		System.out.println("Enetr Customer Aadhaar Number");
		l.getAadhaar(sc.next());
		System.out.println("Enetr Customer Address");
		l.getAddress(sc.next());
		System.out.println("Enetr Customer Employment type");
		l.getEmployment(sc.next());
		System.out.println("Enetr Customer salary");
		l.getSalary(sc.nextDouble());
		

	}

}
