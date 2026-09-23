package com.inheritance.oops;
class Student1{
	int sid;
	String sname;
	Address1 address;
	Student1(int sid,String sname,Address1 address){
		System.out.println("3 arg constructor called");
		this.sid=sid;
		this.sname=sname;
		this.address=address;	
	}
	Student1(Student1 s1){
		System.out.println("copy of 3 arg");
		this.sid=s1.sid;
		this.sname=s1.sname;
		this.address=s1.address;
	}
}
class Address1{
	String city;
	Address1(String city){
		System.out.println("1 arg constructor called");
		this.city=city;
	}
	Address1(Address1 a){
		System.out.println("copy called");
		this.city=a.city;
	}
}

public class DeepcopyUsingconstructor {

	public static void main(String[] args) {
		System.out.println("DeepCopy using copy consturctor ");
		 Address1 a=new  Address1("Eluru");
		 Student1 s1=new Student1(1,"supriya",a);
		 System.out.println("id  :"+s1.sid);
		 System.out.println("name :"+s1.sname);
		 System.out.println("address  "+s1.address.city);
		 System.out.println("-------------------");
		 Student1 s2=new Student1(s1);
		 System.out.println("id  :"+s2.sid);
		 System.out.println("name :"+s2.sname);
		 System.out.println("address  "+s2.address.city);
		 System.out.println("-------------------");
		 s2.sid=2;
		 s2.sname="Guru supriya";
		 s2.address.city="hyd";
		 System.out.println("id  :"+s2.sid);
		 System.out.println("name :"+s2.sname);
		 System.out.println("address  "+s2.address.city);
		 System.out.println("-------------------");
	}

}
