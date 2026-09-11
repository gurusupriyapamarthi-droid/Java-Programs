package com.oops.encapsulation;
class Course{
	static void Duration() {
		System.out.println("parent class course Duration");
	}
}
class JavaCourse extends Course{
	static void Duration() {
		System.out.println("JavaCourse  Duration");
	}
}
class PythonCourse extends Course{
	static void Duration() {
		System.out.println("Python course Duration");
	}
}
class SqlCourse extends Course{
	static void Duration() {
		System.out.println("SQL course Duration");
	}
}
public class Vcube {

	public static void main(String[] args) {
		Course c=new Course();
		c.Duration();
		System.out.println("-----------");
		JavaCourse j=new JavaCourse();
		j.Duration();
		System.out.println("-----------");
		PythonCourse p=new PythonCourse();
		p.Duration();
		System.out.println("-----------------");
		SqlCourse s=new SqlCourse();
		s.Duration();
	}

}
