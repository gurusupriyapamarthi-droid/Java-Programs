package com.project;

import java.util.Scanner;

public class OnlinefoodOrder {
//	Online Food Order
//	Choose restaurant.
//	Select food item.
//	Check item availability.
//	Check wallet balance.
//	Place the order.

	public static void main(String[] args) {
		System.out.println("--------welcome to Online Food Order----------");
		Scanner sc=new Scanner(System.in);
		System.out.println("select the restaurant");
		String  restaurant=sc.nextLine();
		switch(restaurant){
		case "KFC" ->System.out.println("YOU SELECTED KFC RESTAURANT");
		case "Domino's Pizza" ->System.out.println("YOU SELECTED Domino's Pizza RESTAURANT");
		case "Wow! Momo" ->System.out.println("YOU SELECTED Wow! Momo RESTAURANT");
		case "Food Corner" ->System.out.println("YOU SELECTED Food Corner RESTAURANT");
		case "Family Restaurant" ->System.out.println("YOU SELECTED Family Restaurant RESTAURANT");
		case "Royal Kitchen" ->System.out.println("YOU SELECTED Royal Kitchen RESTAURANT");
		 default->
	            System.out.println("your selected restaurant is not available in online ");
		
		}
		
		System.out.println("----------------------------------------");
		System.out.println("order your food from restaurant    :"+restaurant);
		System.out.println();
		System.out.println("enter your orderId");
		int orderId=sc.nextInt();
		if(orderId==1) {
			System.out.println("1. South Indian Meals - ₹150");
		}else if(orderId==2) {
			System.out.println("2. Chicken Biryani - ₹250");
		}else if(orderId==3) {
		System.out.println("	3. Veg Fried Rice - ₹180");
		}else if(orderId==4) {
		System.out.println("4. Pizza - ₹300");
		}else if(orderId==5) {
		System.out.println("5. Burger - ₹120");
		}else if(orderId==6) {
		System.out.println("6. Soft Drink - ₹50");
		}else {
			System.out.println("your order item is not available");
		

			
		}
	

	}

}


