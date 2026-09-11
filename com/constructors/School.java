package com.constructors;

public class School {
	String sclName;
	String stName;
	int cls;
	char gender;
	long phn;
	double rollNo;
	
	School(){
		System.out.println("no arg constructor called");
	}
	
	School(String sclName){
		this("Dakshith",2);
		System.out.println("one arg constructor called ");
		this.sclName=sclName;
		
	}
	School(String stName,int cls){
		this('M',8374045455l,60);
		System.out.println("two arg constructor called");
		//this.sclName=sclName;
		this.stName=stName;
		this.cls=cls;
		
	}
	
	School(char gender,long phn,double rollNo){
		this.gender=gender;
		this.phn=phn;
		this.rollNo=rollNo;
	
		System.out.println("three arg constructor called");
		
	}
	
	School(School a1,School a2,School a3,School a4){
		System.out.println("all arg constructor called");
		this.sclName=a1.sclName;
		this.stName=a2.stName;
		this.cls=a2.cls;
		this.gender=a3.gender;
		this.phn=a3.phn;
		this.rollNo=a3.rollNo;
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		School a=new School();
		a.sis();
		School a1=new School("pallavi");
		a1.sis();
		School a2=new School(a1.sclName);
		a2.sis();
		School a3=new School(a2.stName,a2.cls);
		a3.sis();
		School a4=new School(a3.gender,a3.phn,a3.rollNo);
		a4.sis();
		School a5=new School(a1,a2,a3,a4);
		a5.child();
		
		

	}
	void child() {
		System.out.println("name of the school    :"+sclName);
		System.out.println("name of the student    :"+stName);
		System.out.println("name of the class    :"+cls);
		System.out.println("student rollnumber    :"+rollNo);
		System.out.println("student phn number    :"+phn);
		System.out.println("gender of the student    :"+gender);
		System.out.println("---------------------------------");
	}

	void sis() {
		System.out.println("---------------------------------");
	}
}
