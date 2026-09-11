package com.oops.encapsulation;
class Shape{
	void area() {
		System.out.println("parent method called");
	}
	void area(int a) {
		System.out.println("parent method called    :"+a);
	}
}
class Cirle extends Shape{
	@Override
	void area() {
		System.out.println("child1 method called");
	}
	void area(int a) {
		System.out.println("child1 method called     :"+a);
	}
}
class Rectangle extends Shape{
	@Override
	void area() {
		System.out.println("child2 method called");
	}
	void area(int a) {
		System.out.println("child2 method called      :"+a);
	}
}

public class ShapeCirleRectange {

	public static void main(String[] args) {
		

	}

}
