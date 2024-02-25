package com.example.hr;

public class Employee {

	public String name;
	public int id;
	public double salary;
	
	public Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	public void printname()
	{
		System.out.println("Employee name:"+name);
	}
	public void printid()
	{
		System.out.println("Employee ID:"+id);
	}
	public void printsalary()
	{
		System.out.println("Employee salary:"+salary);
	}

}
