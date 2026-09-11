package com.identifier;

public class Chocolate {

	public static void main(String[] args) {
		System.out.println(" chocolates shop : ");
		// Scanner tm=new Scanner(System.in);
		int eachcost = 18;
		System.out.println("each chocolate " + " " + eachcost);
		int totalmoney = 363;
		System.out.println("total money " + " " + totalmoney);
		int chocolates = totalmoney / eachcost;
		System.out.println("total chocolate " + chocolates);
		int free = chocolates / 5;
		System.out.println("free" + " " + free);
		int totalchocoltes = free + chocolates;
		System.out.println("all chocolates" + " " + totalchocoltes);
		int remaingbalance = totalmoney % eachcost;
		System.out.println("remaing balance" + " " + remaingbalance);

	}

}
