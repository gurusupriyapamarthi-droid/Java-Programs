package com.patterns;

public class Patterns1 {
	static void patterns1() {
		for (int i = 1; i < 6; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void patterns2() {
		for (int i = 6; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void patterns3() {
		for (int i = 1; i < 6; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void patterns4() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 6; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void patterns5() {
		for (int i = 0; i <6; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void patterns6() {
		for (int i = 0; i <5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 6; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("**********Patterns****************");
		patterns1();
		System.out.println("-----------------------");
		patterns2();
		System.out.println("-----------------------");
		patterns3();
		System.out.println("------------------------");
		patterns4();
		System.out.println("------------------------");
		patterns5();
		System.out.println("-----------------------------");
		patterns6();
	}

}
