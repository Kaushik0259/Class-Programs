package com.demo.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestEmployeeComprater {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(111, "Kaushik", 10000);
		Employee emp2 = new Employee(101, "Om", 30000);
		Employee emp3 = new Employee(131, "rajat", 20000);
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		
		System.out.println("Before Sorting");
		System.out.println(emplist);
		
		//EmployeeSalaryComprator sal = new EmployeeSalaryComprator();
		
		//Collections.sort(emplist, sal);
		
		EmployeeName name = new EmployeeName();
		
		Collections.sort(emplist, name);
		
		System.out.println("After Sorting");
		
		
		//EmployeeIdComprator id= new EmployeeIdComprator();
		
		//Collections.sort(emplist, id);
		
		System.out.println(emplist);
		
		

	}

}
