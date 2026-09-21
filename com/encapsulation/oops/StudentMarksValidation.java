package com.encapsulation.oops;

public class StudentMarksValidation {

	public static void main(String[] args) {
		System.out.println("------Student Marks – Validation-----");
		 StudentMarks sm=new  StudentMarks();
		 sm.setMarks(95);
		 System.out.println("student marks :"+sm.getMarks());
		 System.out.println("-----------");
		 sm.setMarks(120);
	}

}
