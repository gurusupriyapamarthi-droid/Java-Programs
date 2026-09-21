package com.encapsulation.oops;

public class StudentDetails {

	public static void main(String[] args) {
		System.out.println("Student Details – Basic Encapsulation");
		Studentinfo s=new Studentinfo();
		//s.sname("supriya");
		s.setSname("supriya");
		s.setSno(65);
		s.setSmarks(95);
		System.out.println("name of the student   :"+s.getSname());
		System.out.println("no. of the student   :"+s.getSno());
		System.out.println("student marks   "+s.getSmarks());
	}

}
