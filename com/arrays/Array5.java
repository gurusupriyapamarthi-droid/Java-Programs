package com.arrays;

public class Array5 {

	public static void main(String[] args) {
		System.out.println("matrix start");
		int[][] num;
		num = new int[2][3];
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[1][0] = 40;
		num[1][1] = 50;
		num[1][2] = 60;
		System.out.println(num.length);
		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}

}
