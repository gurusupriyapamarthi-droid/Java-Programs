package com.patterns;

public class MirrorPattern {
	static void mirror() {
		for (int i = 1; i < 5; i++) {
			for (int j = i; j >0; j--) {
				System.out.print(j);
			}
				for(int j=7;j>=2*i;j--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
		}
	}
	static void mirror2() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
				for(int j=7;j>=2*i;j--) {
					System.out.print(" ");
				}
				for(int j=i;j>=1;j--) {
					System.out.print(j);
				}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("-----------Mirror Pattern-----------");
		mirror();
		System.out.println("----------------------");
		mirror2();
		}

	
}
