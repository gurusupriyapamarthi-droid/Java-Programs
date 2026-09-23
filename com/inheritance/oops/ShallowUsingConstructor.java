package com.inheritance.oops;
class Student3{
	int id;
	Address3 addres;
	public Student3(int id, Address3 addres) {
		super();
		this.id = id;
		this.addres = addres;
	}
	public Student3(Student3 s) {
		super();
		this.id = s.id;
		this.addres =s. addres;
	}
}
class Address3{
	String city;

	public Address3(String city) {
		super();
		this.city = city;
	}
	public Address3(Address3 a) {
		super();
		this.city = a.city;
	}
	
}

public class ShallowUsingConstructor {

	public static void main(String[] args) {
		
		System.out.println("shallow copy using copy constructor");
		Address3 a=new Address3("hyd");
		Student3 s= new Student3(1,a);
		System.out.println("id  :"+s.id+"   "+"city   :"+s.addres.city);
		Student3 s1= new Student3(s);
		System.out.println("--------------");
		System.out.println("id  :"+s1.id+"   "+"city   :"+s1.addres.city);
		s1.id=2;
		s1.addres.city="elr";
		System.out.println("-----------");
		System.out.println("id  :"+s1.id+"   "+"city   :"+s1.addres.city);
		System.out.println("id  :"+s.id+"   "+"city   :"+s.addres.city);

	}

}
