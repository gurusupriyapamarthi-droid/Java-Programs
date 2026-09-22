package com.inheritance.oops;

class Student implements Cloneable{
	int id;
	Address address;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s=(Student) super.clone();
		s.address=(Address) s.address.clone();
		return s;
	}
}
class Address implements Cloneable{
	String city;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Deepcopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Deep copy using Clone method");
		Address a=new Address();
		a.city="eluru";
		Student s=new Student();
		s.id=10;
		s.address=a;
		Student s1=(Student)s.clone();
		System.out.println(s1.id);
		System.out.println(s1.address.city);
	}

}
