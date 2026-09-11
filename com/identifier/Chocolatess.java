package com.identifier;

public class Chocolatess {

	public static void main(String[] args) {
		System.out.println(" chocolates shop : ");
		// Scanner tm=new Scanner(System.in);
		double eachcost = 18.67;
		System.out.println("each chocolate " + " " + eachcost);
		int totalmoney = 363;
		System.out.println("total money " + " " + totalmoney);
		double chocolates = totalmoney / eachcost;
		System.out.println("total chocolate " + chocolates);
		double free = chocolates / 5;
		System.out.println("free" + " " + free);
		double totalchocoltes = free + chocolates;
		System.out.println("all chocolates" + " " + totalchocoltes);
		double remaingbalance = totalmoney % eachcost;
		System.out.println("remaing balance" + " " + remaingbalance);

	}

}
