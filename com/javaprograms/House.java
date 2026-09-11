package com.javaprograms;

public class House {
	

	public  static void main(String[] args) {
		 System.out.println("main method started");
		 method1(); 
		 House t=new  House();
		 System.out.println("main method ended");
		 
	 }
	 static void method1() {
		 System.out.println("method1 call");
		 method2();
		 
	 }
	 static void method2() {
		 System.out.println("method2 call");
		 House t=new  House();
		 t.method3();
		
		
		 
	 }
	 void method3() {
		 System.out.println("method3 call");
		 method4();
		 
		
		
	 }
	 void method4() {
		 System.out.println("method4 call");
		 
	 }

}
