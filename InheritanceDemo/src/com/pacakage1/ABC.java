package com.pacakage1;
/*
 * Inheritance:
 * It is the mechanism in java by which one class is allowed to 
 * inherit the features(filed and methodS) of another class.
 * 
 * In java  inheritance means creating new classes based on existing ones
 * A class that inheritance 
 * code re-usability
 * abstraction 
 */
class Parent
{
	int i;
	public void parentMethod()
	{
		System.out.println(i);
	}
}

class Child extends Parent
{
	int j;
	public void parentMethod()
	{
		System.out.println(j);
	}
}
public class ABC {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.i=10;
		p.parentMethod();
		
		Child c= new Child();
		c.j=20; //child class property
		c.i=30;//parent class property
		c.parentMethod();
		c.hashCode();
	}

}
