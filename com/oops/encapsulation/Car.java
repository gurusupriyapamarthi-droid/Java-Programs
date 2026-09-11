package com.oops.encapsulation;

 class Vehicle {
	 int speed = 50;

	 void display() {
		System.out.println("speed of the vechile parent :" + speed);
	}

}
 public class Car extends Vehicle {
	 
	 int speed = 100;

	 void display() {
		// super.display();
		System.out.println("speed of the vechile child  :" + speed);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Vehicle obj = new Car();
		obj.display();
	}
}
