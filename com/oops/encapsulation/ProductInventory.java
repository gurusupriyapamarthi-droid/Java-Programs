package com.oops.encapsulation;

public class ProductInventory {
	private int productId;
	private String productName;
	private double  price;
	private int   quantity;
	
	ProductInventory(int productId,String productName,double  price,int   quantity){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		if(price>0) {
			System.out.println("price is positive");
		}
		else {
			System.out.println("price is negative");
		}
		if(quantity>0) {
			System.out.println("quantity is added");
		}else {
			System.out.println("quantity cant be negative");
		}
	}
	void addStock(int amount) {
		if(amount<=0) {
			System.out.println("amount cant be negative");
		}
		else {
			System.out.println("amount is positive");
		}
	}
	void removeStock(int amount) {
		if(amount<=0) {
			System.out.println("stock cant be negative");
		}
		else {
			System.out.println("stock is positive");
		}
	}
	public static void main(String[]args) {
		ProductInventory a=new ProductInventory(1,"laptop",500000,1);
		a.addStock(500);
		a.removeStock(2);
		a.show();
		
	}
	void show() {
		System.out.println("product Id  :"+productId);
		System.out.println("productName  :"+productName);
		System.out.println("price  :"+price);
		System.out.println("quantity  :"+quantity);
	}
	
	

}
