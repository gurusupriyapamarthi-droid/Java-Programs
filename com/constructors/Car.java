package com.constructors;

public class Car {
	String cname;
	String brand;
	int model;
	double price;
	
	Car(String cname,String brand,int model,double price){
		this.cname=cname;
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}
	
	Car(){
		System.out.println();
	}
	void show() {
		System.out.println("name of the car:  "+cname);
		System.out.println("name of the brand:  "+brand);
		System.out.println("name of the model:  "+model);
		System.out.println("name of the price:  "+price);
		System.out.println("-----------------------------");
	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		Car c=new Car("h","honda",336,386);
		c.show();

	}

}
