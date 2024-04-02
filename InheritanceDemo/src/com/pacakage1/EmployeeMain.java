package com.pacakage1;

class Employee
{
	public int salary;// attribute of employee class
	
	public Employee(int sal)// special type of method/ constructor
	{
		salary = sal;
	}
	
	public void work()//method of employee class
	{
		System.out.println("Working as a employee");
	}
	
	public int getsalary()
	{
		return salary;
	}
}

class Manager extends Employee
{
	public Manager(int sal)
	{
		super(sal);
	}
	
	public void work()
	{
		System.out.println("Managing the employee");
	}
	
	public void addEmployee()
	{
		System.out.println("Adding the new employee");
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee em= new Employee(100000);
		Manager man= new Manager(700000);
		
		em.work();
		System.out.println("Employee salary:"+em.getsalary());
		man.work();
		System.out.println("Manager salary:"+man.getsalary());
		man.addEmployee();
	}

}
