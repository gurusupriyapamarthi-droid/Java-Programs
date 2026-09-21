package com.encapsulation.oops;

public class EmployeeSalary {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    public double getSalary() {
        return salary;
    }

	public static void main(String[] args) {
		System.out.println("----------Employee Salary------");
		EmployeeSalary e=new EmployeeSalary();
		        e.setName("Supriya");
		        e.setSalary(30000);
		        System.out.println("Name: " + e.getName());
		        System.out.println("Salary: " + e.getSalary());
		    }
		

	}


