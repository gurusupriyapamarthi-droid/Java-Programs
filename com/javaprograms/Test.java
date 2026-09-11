package com.javaprograms;

class A{
	B a;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize1");
	}
	
}
class B{
	A b;
	protected void finalize() throws Throwable {
		System.out.println("finaliz b");
	}
}
public class Test {
	static void methodA(){
		
		Test t=new Test();
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" finalize called");
		
	}
	 

	public static void main(String[] args) {
		System.out.println("method started");
//		Test c1=new Test();
//		Test c2=new Test();
//		Test c3=new Test();
//		// System.out.println(c1);
//		System.out.println("c2"+c2);
//		System.out.println("c3"+c3);
//		System.out.println("method ended");
//	
//	    c1=null;
//	    c2=c3;
//	    System.out.println("c2"+c2);
//	    methodA();
//	   System.gc();
//	   
//	   new Test();
	 
	   
	A a1=new A();
	B b1=new B();
	a1.a=b1;
	b1.b=a1;
	a1=null;
	b1=null;
	  System.gc();	
		
		
				

	}

	}
