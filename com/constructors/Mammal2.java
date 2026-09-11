package com.constructors;

public class Mammal2 {
	String name;
	int age;
	
	Mammal2 (){
		System.out.println("no arg constructor in animal---");
	}
	
}

class Animals{
	Animals(){
		System.out.println("----------");
	}
}
class Dogs extends Animals{
	Dogs(String name,int age){
		System.out.println("no arg constructor in Dog---");
	}
	private void syso() {
		System.out.println("main method ");
		Dog obj=new Dog("joy",2);
		
	}
}






	
