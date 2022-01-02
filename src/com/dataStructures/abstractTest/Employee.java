package com.dataStructures.abstractTest;

public class Employee extends People {
	
	private String kkk;
	
	
	
	public Employee(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	
	public static void kkkk() {
		System.out.println("lll");
	}


	@Override
	public double finalSalary() {
		//this.salary +=  5000;
		this.setSalary(this.getSalary() + 5000);
		return this.getSalary();
	}

}
