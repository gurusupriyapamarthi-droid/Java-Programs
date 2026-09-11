package com.oops.encapsulation;
class Employee{
	void  calculateSalary(){
		
		System.out.println("parent class method called");
		}
	void  calculateSalary(double bonus){
		double salary=5000;
		 salary=salary+bonus;
		System.out.println("parent class method called with bonus          :"+salary);
		}
}
class Developer extends Employee{
	@Override
void  calculateSalary() {
		
		System.out.println("child class method called");
		}

	void  calculateSalary(double bonus){
		double salary=5000;
		 salary=salary+bonus;
		System.out.println("child class method called with bonus      :"+salary);
		}
}

public class EmployeeDeveloper {

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e=new Employee();
		e.calculateSalary();
		e.calculateSalary(3000);
		Developer d=new Developer();
		System.out.println("---------------------");
		d.calculateSalary();
		d.calculateSalary(5000 );
		System.out.println("-------------");
	}

}
