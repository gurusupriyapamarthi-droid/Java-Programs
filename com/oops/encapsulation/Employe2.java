package com.oops.encapsulation;
class Employe{
	static void caSalary(int salary){
		System.out.println("parent class method called    :"+salary);
	}
}
class Develop extends Employe{
	
	static void caSalary(int salary){
		System.out.println("child1 class method called      :"+salary);
	}
}
class Tester extends Employe{
	static void caSalary(int salary){
		System.out.println("child2 class method called    :"+salary);
	}
}
class Manager extends Employe{
	static void caSalary(int salary){
		System.out.println("child3 class method called     :"+salary);
	}
}
public class Employe2 {

	public static void main(String[] args) {
		System.out.println("------Employe class---------");
		Employe e=new Employe();
		e.caSalary(20000);
		System.out.println("--------------");
		 Develop d=new Develop();
		 d.caSalary(15000);
		 System.out.println("------------");
		 Tester t=new Tester();
		 t.caSalary(30000);
		 System.out.println("-------------");
		 Manager m=new  Manager();
		 m.caSalary(50000);
		 System.out.println("----------------");
		
		 
	}

}
