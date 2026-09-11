package com.sortingDSA;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		int random=r.nextInt(0, 11) ;
		int count=0;
		for(int i=0;i<3;i++) {
			count++;
			System.out.println("Guess the number    :");
			int guess=sc.nextInt();
			if(guess==random) {
				System.out.println("your guess is correct");
				break;
			}
			
			else if(guess!=random) {
				System.out.println("incorrect guess  :");
			}
			
		}if(count==3) {
			System.out.println("betterluck next time:");
			System.out.println(random);
		}
		

	}

}
