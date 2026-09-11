package com.arrays;

public class Array4 {

	public static void main(String[] args) {
		System.out.println("main method start");
		String[][] name;
		name=new String[3][3];
		name[0][0]="supriya";
		name[0][1]="b tech";
		name[0][2]=" ece";
		name[1][0]="eluru";
		name[1][1]="crr";
		name[1][2]="vcube";
		name[2][0]="jfs";
		name[2][1]="kbhp";
		name[2][2]="hyd";
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<name.length;j++) {
				System.out.print(name[i][j]+"\t");
			}
		System.out.println();
			
		}
		

	}

}
