package com.dataStructures.abstractTest;

public abstract class People {
	
	protected String name;
	protected double salary;
	
	public abstract double finalSalary();
	
	
	
	
	public People(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}




	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "People [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
