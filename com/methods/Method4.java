package com.methods;

import java.util.Scanner;

public class Method4 {
	
	
	
	void productName(String pname) {
		
	        System.out.println("Product Name : " + pname);
	    }
	void productId(int id) {
		System.out.println("product id :"+id);
	}
	

	public static void main(String[] args) {
		System.out.println("no return type + with arguments using scanner");
		System.out.println("**********************************************");
		Scanner sc = new Scanner(System.in);
		 Method4 obj4 = new Method4();

        System.out.print("Enter Product Name: ");
        String pname = sc.nextLine();
        
        System.out.println("enter product id:");
        int id=sc.nextInt();
        obj4.productId(id);
        obj4.productName(pname); 

	}

}
