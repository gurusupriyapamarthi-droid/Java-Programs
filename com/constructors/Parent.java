package com.constructors;

class gParent {
	int age;
	String name;
	
//	gParent(){
//		System.out.println("no arg parent");
//	}
	gParent(int age){
		System.out.println("no arg parent args");
	}
}
class child extends gParent{
	child(){
		this(10);
		System.out.println("no arg child");
	}
	child(int a){
		super(a);
		System.out.println("no arg child args");
	}
}
public class Parent{
public static void main(String[] args) {
		child c=new child();

	}
}


	

