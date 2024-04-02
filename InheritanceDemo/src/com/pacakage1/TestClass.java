package com.pacakage1;

class Student
{
	int rollNo;
	String name;
	float fee;
	
	Student(int rollNo, String name, float fee)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollNo+" "+name+" "+fee);
	}
}

public class TestClass {

	public static void main(String[] args) {
		
		Student s1=new Student(1, "Kaushik", 90000);
		
		Student s2=new Student(2, "Rajat", 7000);
		
		s1.display();
		s2.display();
	}

}
