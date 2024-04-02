package com.demo;
/* The java throw keyword is used to explicitly throw an exception. 
 * we can throw either checked or unchecked exception in java by throw keyword. the throw keyword 
 */

/*ArtithmeticException ae = new ArithmeticException // object creation
 * ArtithmeticException ae; //reference variable
 * new ArtithmeticException()// instance of class
 */
public class ThrowDemo {
	
	void validate(int age)
	{
		if(age<18)
		throw new ArithmeticException("age is not valid");
		else 
			System.out.println("Ur eligible for voting");
	}
	public static void main(String[] args) {
		
		ThrowDemo td = new ThrowDemo();
		try
		{
			td.validate(13);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Welcome for voting");
		}
	}

}
