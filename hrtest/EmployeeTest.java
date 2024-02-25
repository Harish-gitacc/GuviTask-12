package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee("Harish",101,55000);
		emp.printname();
		emp.printid();
		emp.printsalary();
	}

}



OUTPUT:
Employee name:Harish
Employee ID:101
Employee salary:55000.0

