package com.constructors;

public class Animal{
	String name;
	int age;
	
	Animal(){
		System.out.println("no arg constructor in animal---");
	}
}

class Dog extends Animal{
	Dog(String name,int age){
		System.out.println("no arg constructor in Dog---");
	}
}
class Mammal extends Animal{
	Mammal(){
		System.out.println("no arg constructor in Mammal---");
	}


void show() {
	System.out.println("name of the animal"+name);
	System.out.println("age of the animal"+age);
}





	public static void main(String[] args) {
		System.out.println("main method started");
		Mammal obj=new Mammal();
		Animal obj1=new Animal();
		//obj.show();
		System.out.println("main method ended");
		

	}

}

