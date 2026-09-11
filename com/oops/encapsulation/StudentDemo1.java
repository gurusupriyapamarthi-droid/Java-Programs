package com.oops.encapsulation;

public class StudentDemo1 {

	public static void main(String[] args) {
		Student s1=new Student();
		
// this is direct accessing
//		s1.sid=60;
//		s1.sname="abcd";
//		s1.age=22;
//		
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.age);

		s1.setSid(60);
		s1.setSname("supriya");
		s1.setAge(22);
		
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getAge());
	}

}
