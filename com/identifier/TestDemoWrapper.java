package com.identifier;

public class TestDemoWrapper {

	public static void main(String[] args) {
		System.out.println("main method start");
		
		String s="5007766";
		Integer n=Integer.parseInt(s);
		System.out.println(n);
		System.out.println();
		
		String s1="3293.8375903393";
		double n1=Double.parseDouble(s1);
		System.out.println(n1);
		System.out.println();
		
		String s2="True";
		boolean n2=Boolean.parseBoolean(s2);
		System.out.println(n2);
		System.out.println();
		
		char s3='A';
		String n3=Character.toString(s3);
		System.out.println(n3);
	}

}
