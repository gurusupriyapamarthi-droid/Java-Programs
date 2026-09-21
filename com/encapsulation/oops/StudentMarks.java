package com.encapsulation.oops;

public class StudentMarks {
	private int marks;
	
	public void setMarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.marks=marks;
		}else {
			System.out.println("Invalid marks");
		}
	}
	public int getMarks() {
		return marks;
	}

}
