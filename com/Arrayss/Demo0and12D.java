package com.Arrayss;

import java.util.Arrays;

public class Demo0and12D {

	public static void main(String[] args) {
		int[][]arr= {{1,1,0},{1,1,1},{0,1,0}};
		
		for(int i=0;i<arr.length;i++) {
			
				for(int j=0;j<arr.length-1;j++) {
					if(arr[i][j]==0) {
					arr[j][i]=0;
				}
			}
		}
		System.out.print(Arrays.deepToString(arr));
	}

}
