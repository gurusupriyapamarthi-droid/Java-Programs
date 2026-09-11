package com.oops.encapsulation;
class Parentvechile{
	void start() {
		System.out.println("parent vechile start");
	}
}
class Car1 extends Parentvechile{
	void start() {
		System.out.println("child vechile start");
	}
	void drive() {
		System.out.println("car drive child");
	}
}

public class Vechile {

	public static void main(String[] args) {
		System.out.println("main method started");
		Parentvechile p1=new Parentvechile();
		Car1 c1=new  Car1();
		Parentvechile p2=new Car1();
		//Car c2=(Car) new Parentvechile();
		p1.start();
		c1.start();
		c1.drive();
		p2.start();
	//	p2.start();
		//c2.start();
		//c2.drive();
	}

}
