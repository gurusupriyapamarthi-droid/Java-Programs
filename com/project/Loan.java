package com.project;

public class Loan {
	void getName(String name) {
		System.out.println("Customer Name    :" + name);
	}

	boolean getPhone(String phn) {
		System.out.println("Customer phoneNumber    :" + phn);
		return phn.matches("[6-9]{1}[0-9]{9}");
	}

	void getAddress(String address) {
		System.out.println("Customer Address    :" + address);
	}

	boolean getPan(String pan) {
		System.out.println("Customer panNumber     :" + pan);
		return pan.matches("[a-z]{5}[0-9]{4}[a-z]{1}");
	}

	boolean getAadhaar(String aadhaar) {
		System.out.println("Customer AadhaarNumber    :" + aadhaar);
		return aadhaar.matches("[0-9]{12}");
	}

	void getEmployment(String type) {
		System.out.println("Employment type    :" + type);
	}

	double getSalary(double salary) {
		System.out.println("Monthly income      :" + salary);
		return salary;
	}

	int getAge(int age) {
		if (age >= 24 && age <= 55) {
			System.out.println("your eligible");
		} else {
			System.out.println("not eligible");
		}
		System.out.println("Customer age    :" + age);
		return age;
	}

	public static void main(String[] args) {
		System.out.println("------Wellcome Loan Banking Process-----");

	}

}
