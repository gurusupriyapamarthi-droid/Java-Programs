package com.conditionalstatements;
import java.util.Scanner;
public class Vowels {
	public static void main(String[] args) {
		System.out.println("---------vowels------");
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a word   :");
		String word=sc.nextLine();
		int count=0;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
			}	
		}
		System.out.println(" vowels count  "+count);
	}
}
