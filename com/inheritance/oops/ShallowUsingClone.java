package com.inheritance.oops;
class Student2 implements Cloneable{
	int id;
	String name;
	Address2 address;
	public Student2(int id,String name, Address2 address) {
		System.out.println("2 arg constructor called");
		this.id = id;
		this.name=name;
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("student clone called");
		return super.clone();
	}	
}
class Address2{
	String city;

	public Address2(String city) {
		System.out.println("1 arg constructor called");
		this.city = city;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("address clone called");
		return super.clone();
	}
	
}

public class ShallowUsingClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Shallow copy using clone");
		Address2 a=new Address2("eluru");
		Student2 s=new Student2 (1,"aaa",a);
		System.out.println("id  :"+s.id + "  "+"city  :"+s.address.city+"name "+"  "+s.name);
		Student2 s2=(Student2)s.clone();
		System.out.println("--------------------");
		System.out.println("id  :"+s.id + "  "+"city  :"+s.address.city+"    "+"name "+"   "+s.name);
		System.out.println("id  :"+s2.id + "  "+"city  :"+s2.address.city+"   "+"name "+s2.name);
		s2.address.city="hyd";
		s2.id=4;
		s2.name="bbb";
		System.out.println("id  :"+s.id + "  "+"city  :"+s.address.city+"   "+"name "+s.name);
		System.out.println("id  :"+s2.id + "  "+"city  :"+s2.address.city+"   "+"name "+s2.name);
		
		
	}

}
