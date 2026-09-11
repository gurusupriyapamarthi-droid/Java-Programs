package com.constructors;

public class CCDemo2 {
	String fullName;
	int age;
	short salary;
	long phNo;
	float height;
	double weight;
	char gender;
	
	CCDemo2(){
		//this("Guru Supriya");
		System.out.println("no arg constructor");
		
	}
	
	CCDemo2(String fullName){
	//	this(22,(short) 2000);
		System.out.println("one arg constructor");
		this.fullName=fullName;
		this(22,(short) 2000);
		
	}
	
	CCDemo2(int age,short salary){
//		this(8374045455L,5.0f,39.80);
		System.out.println("two arg constructor");
		this.age=age;
		this.salary= salary;
	}
	
	 CCDemo2(long phNo,float height,double weight) {
		System.out.println("three arg constructor");
		this.phNo=phNo;
		this.height=height;
		this.weight=weight;
	}

	public static void main(String[] args) {
		System.out.println("main method started:   ");
		CCDemo2 obj=new CCDemo2();
		obj.Display();
		
		CCDemo2 obj1=new CCDemo2("supriya");
		obj1.Display();
		
		CCDemo2 obj2=new CCDemo2(22,(short) 42);
		obj2.Display();
		
		CCDemo2 obj3=new CCDemo2(36429582493l,33.45f,36593.853);
		obj3.Display();
	}
	void Display() {
		System.out.println("*******************************");
		System.out.println("fullName is    :"+fullName );
		System.out.println("age  is    :"+age );
		System.out.println("salary is    :"+ salary );
		System.out.println("phone number is    :"+phNo );
		System.out.println("height is    :"+height );
		System.out.println("weight is    :"+weight );
		System.out.println("Gender is    :"+gender );
		System.out.println("**********************************");
	}
}
