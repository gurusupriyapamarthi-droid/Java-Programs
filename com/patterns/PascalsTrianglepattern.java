package com.patterns;

public class PascalsTrianglepattern {
	static void firstHalf() {
		int n=5;
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			int x=1;
			for(int j=0;j<=i;j++) {
				System.out.print(x+" ");
				x=x*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		System.out.println("---------- Pascal's Triangle pattern-------------------");
		firstHalf();
		//secondHalf();

	}

}
