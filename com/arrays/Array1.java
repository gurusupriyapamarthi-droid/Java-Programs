package com.arrays;

public class Array1 {

	public static void main(String[] args) {
		System.out.println("main method start");
		int[] number;//declaration
		number=new int[5];//creation
		number[0]=4;
		number[1]=5;
		number[2]=6;
		number[3]=8;
		number[4]=0;//initialazation
		for(int i=0;i<number.length;i++) { //representation
			System.out.println(number[i]);
		}
		

	}

}
