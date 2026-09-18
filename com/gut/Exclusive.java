package com.gut;

public class Exclusive {
	static boolean isExclusions(int[][] arr) {
		System.out.println("Exclusive method called");
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			flag=false;
			int start = arr[i][0];//1
			int end = arr[i][1];//2
			for (int j = 0; j < arr.length; j++) {
				int ostart = arr[j][0];//2
				int oend = arr[j][1];//10
				if (i == j) {
					continue;
				}
				if (start < ostart && end > oend) {
					flag = true;
					break;
				}

			}
			if (flag == true) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
		return flag;
	}

	static boolean isInclusive(int[][] arr) {
		System.out.println("Inclusive method called");
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			for (int j = 0; j < arr.length; j++) {
				int ostart = arr[j][0];
				int oend = arr[j][1];
				if (i == j) {
					continue;
				}
				if (start >= ostart && end <= oend) {
					status = true;
					break;
				}
			}
			if (status == true) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("Exclusions and Inclusion of the  2D Array");
		int[][] arr = { { 1, 2 }, { 2, 10 }, { 3, 9 }, { 5, 8 } };
		boolean status = isExclusions(arr);
		System.out.println("--------------------------");
		boolean flag = isInclusive(arr);


	
	
	}

}
