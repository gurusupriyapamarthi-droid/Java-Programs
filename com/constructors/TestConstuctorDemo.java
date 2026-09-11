package com.constructors;

public class TestConstuctorDemo {
	String colegeName;
	String sName;
	int sNumber;
	int a=10;
//	TestConstuctorDemo() {
//		this("vcube", "java");
//	}

	TestConstuctorDemo(String colegeName, String sname) {
	//	this("s","r",156);

		this.colegeName=colegeName;
		this.sName=sname;
		this("s","r",156);

	}

	TestConstuctorDemo(String colegeName, String sname, int sNumber) {
		this.colegeName=colegeName;
		this.sName=sname;
		this.sNumber=sNumber;//after
	}

	public static void main(String[] args) {
		TestConstuctorDemo t1 = new TestConstuctorDemo("crr","supriya");
		t1.a=20;
		
		t1.show();
	}

	void show() {
		System.out.println("name " + colegeName);
		System.out.println("name " + sName);
		System.out.println("number " + sNumber);
	}

}
