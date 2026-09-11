package com.constructors;

class Employee {

    int empId;
    String empName;
    double salary;

    
    Employee() {
        this(101); 
        System.out.println("Default Constructor");
    }

   
    Employee(int empId) {
        this(empId, "Supriya");
        System.out.println("One Parameter Constructor");
    }

    
    Employee(int empId, String empName) {
        this(empId, empName, 50000.0); 
        System.out.println("Two Parameter Constructor");
    }

   
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;

        System.out.println("Three Parameter Constructor");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
    	System.out.println("main method started");
        Employee e = new Employee();
      //  Employee e1= new Employee(23);

    	System.out.println("main method ended");
    	
    }
}
