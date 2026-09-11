package com.oops.encapsulation;
class Student1{
	int sid;
	String sname;
	Address add;
	public Student1(int sid,String sname,Address add){
		super();
		this.sid=sid;
		this.sname=sname;
		this.add=add;
	}
	public Student1(Student1 st1){
		this.sid=st1.sid;
		this.sname=st1.sname;
		//this.add=st1.add;
		this.add=new  Address(st1.add);
	}
}
class Address{
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}
	public Address(Address ad) {
		this.city=ad.city;
	}
	
}

public class Deepcopy {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Address ad=new Address("Eluru");
		Student1 st1=new Student1(1,"supriya",ad);
		System.out.println(st1.sid);
		System.out.println(st1.sname);
		System.out.println(st1.add.city);
		System.out.println("-----------------------------------");
		System.out.println("copy");
		Student1 st2=new Student1(st1);
		System.out.println(st2.sid);
		System.out.println(st2.sname);
		System.out.println(st2.add.city);
		System.out.println("-----------------------------------");
		st2.add.city="hyd";
		st2.sid=2;
		st2.sname="priya";
		System.out.println(st1.sid);
		System.out.println(st1.sname);
		System.out.println(st1.add.city);
		System.out.println("-----------------------------------");
		System.out.println(st2.sid);
		System.out.println(st2.sname);
		System.out.println(st2.add.city);
	}

}
