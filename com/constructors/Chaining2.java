package com.constructors;

public class Chaining2 {
	String name;
	int number;
	
	Chaining2(){
//		this("supriya",123);
	System.out.println("no arg");
	this("supriya",123);
	}
	Chaining2(String name,int number){
		System.out.println("2 arg");
		this.name=name;
		this.number=number;
	}
	public static void main(String[] args) {
		System.out.println("main-----------");
		Chaining2 obj=new Chaining2();
		obj.shoe();
		
		

	}
	void shoe() {
		System.out.println(" name  :"+ name);
		System.out.println("int :"+ number);
	}

}
