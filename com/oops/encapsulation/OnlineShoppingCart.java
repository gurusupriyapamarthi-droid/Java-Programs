package com.oops.encapsulation;

class Item{
	private String name;
	private double price;
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
class Shopping{
	private Item[]item=new Item[5];
	int idx=0;
	private double totalAmount=0;
	
	public  void addItem(String name,double price) {
		
		Item obj=new Item(name,price);
		item[idx++]=obj;
	//	totalAmount=totalAmount+obj.getPrice();
		System.out.println("add to cart   :"+obj.getName()+"   = "+obj.getPrice());	
	}
	public void removeItem(String name) {
		for(int i=0;i<idx;i++) {
		if(item[i].getName()==name) {
			item[i]=null;
			break;
		}else {
			System.out.println("not found ietm   :"+item[i].getName());
		}
	}
		}
	public double getTotal() {
		for(int i=0;i<idx;i++) {
			if(item[i]!=null)
			totalAmount+=item[i].getPrice();
		}
		return totalAmount;
	}	
}

public class OnlineShoppingCart {
	
	public static void main(String[] args) {
	System.out.println("--------------online shopping cart-----------");	
	Shopping ob=new Shopping();
	ob.addItem("laptop", 50000);
	ob.addItem("mobile", 10000);
	ob.addItem("AC",40000);
	System.out.println("removed Items");
	ob.removeItem("AC");
	
	System.out.println("total Amount  :"+ob.getTotal());
	}

}
