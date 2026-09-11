package com.arrays;

public class Array8 {
	static  {
		System.out.println("main method start !");
		
	}
	

	public static void main(String[] args) {
		System.out.println("matrix start !");
		int[][] num;
		num = new int[3][2];
		num[0][0] = 10;
		num[0][1] = 20;
		num[1][0] = 30;

		num[1][1] = 40;
		num[2][0] = 50;
		num[2][1] = 60;

		

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		{
			System.out.println("main method end!");
		}

	}

}
