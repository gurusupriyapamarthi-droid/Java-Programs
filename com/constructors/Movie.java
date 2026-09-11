package com.constructors;

public class Movie {
	String mname;
	String hero;
	String heroin;
	double budget;
	
	Movie(){
		System.out.println("no arg");
	}
	Movie(String mname){
		System.out.println("one arg");
	}
	
	Movie(String hero,String heroin){
		//this.mname=b.mname;
		
		
		System.out.println("two arg");
	}
	Movie(String mname,String hero,String heroin,double budget){
		this.mname=mname;
		this.hero=hero;
		this.heroin=heroin;
		this.budget=budget;
		
	}

	public static void main(String[] args) {
		System.out.println("main method strted");
		Movie a=new Movie();
		
		Movie b=new Movie("lenin");
		
		Movie c=new Movie("ayyagaru","bagyasree");
		c.show();
		

	}
	void show() {
		System.out.println(mname);
		System.out.println(hero);
		System.out.println(heroin);
	}

}
