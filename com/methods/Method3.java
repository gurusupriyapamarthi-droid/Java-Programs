package com.methods;

import java.nio.file.spi.FileSystemProvider;

public class Method3 {
	void motherName(String mname) {
		System.out.println("my mother name is: "+mname);
		
	}
	void brotherName(String bname) {
		System.out.println("my brother name is: "+bname);
	}
	void homeTown(String ht) {
		System.out.println("my hometown is: "+ht);
	}
	void phNo(long ph) {
		System.out.println("my mobile number is:"+ph);
	}
	void dateofBirth(String db) {
		System.out.println("my Date of Birth is:"+db);
	}
	void myWeight(float wt) {
		System.out.println("my weight is :"+wt);
	}
	void bloodGroup(char blood) {
		System.out.println("my blood group is:"+blood);
	}

	public static void main(String[] args) {
	System.out.println("no return type + with arguments");
	System.out.println("--------------------------------");
	System.out.println("personal details");
	Method3 obj3=new Method3();
	obj3.motherName("valli");
	obj3.brotherName("Gani");
	obj3.homeTown("Eluru");
	obj3.phNo(8374047455l);
	obj3.brotherName("12-05-2004");
	obj3.myWeight(39.70f);
	obj3.bloodGroup('A');

	}

}
