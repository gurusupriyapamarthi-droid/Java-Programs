package com.arrays;

public class Array2 {

	public static void main(String[] args) {
		System.out.println("main method start");
		int[] ages;
		ages = new int[3];// n=3....index n-1=0,1,2
		ages[0] = 20;
		ages[1] = 21;
		ages[2] = 22;
		

		for (int i = 0; i < ages.length; i++) {
			System.out.print(" "+ages[i]);
			
		}

	}

}
