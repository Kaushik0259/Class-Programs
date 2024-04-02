package com.demo;
/* The Java throws keyword is used to declare an exception.
 * It give an information to the programmer that there may occur an e
 * so it 
 */
public class ThrowsDemo {
	
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
		System.out.println("ye bhi execute ho raha hu");
	}

}
