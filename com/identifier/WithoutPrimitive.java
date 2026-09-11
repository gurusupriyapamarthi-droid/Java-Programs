package com.identifier;

public class WithoutPrimitive {
	Integer empno=60;
	String name="supriya";
	Double salary= 50000.00;
	String hiredate="12-05-2026";
	Integer Experience=2;
	private String annualsalary;
	private String annualbonus;
	private String totalsalary;
	
	{
		Double annualsalary=salary * 12;
		Double annualbonus=annualsalary*10/100;
		Double totalsalary=annualsalary+annualbonus;
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method start!");
		
		
		
		WithoutPrimitive emp=new WithoutPrimitive();
		
		System.out.println("employee no:"+ emp.empno);
		System.out.println("employee name:"+ emp.name);
		System.out.println("employee salary:"+ emp.salary);
		System.out.println("employee hiredate:"+ emp.hiredate);
		System.out.println("employee experience:"+ emp.Experience);
		System.out.println();
		System.out.println("employee annualsalary:"+ emp.annualsalary);
		System.out.println("employee annualbonus:"+ emp.annualbonus);
		System.out.println("employee totalsalary:"+ emp.totalsalary);
		
	     
		

	}

}
