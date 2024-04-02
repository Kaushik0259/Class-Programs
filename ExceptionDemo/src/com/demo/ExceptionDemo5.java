package com.demo;

/*
 * Checked Exception
 * The exception that can be predicted by the programmer at the compile time.
 * ex: file that need to be opened is not found. These type of exception must be checked at compile time
 * 
 *  Unchecked Exception
 */

public class ExceptionDemo5 {

	public static void main(String[] args) {
		
		int result,  a= 10, b=0;
		try
		{
			result =a/b;
			System.out.println(result);
			System.out.println("Im in the between statement");
		}
		
		catch(Exception e)
		{
			System.out.println("null values in the variable");
		}
		finally
		{
			System.out.println("Close all the connection");
		}
		System.out.println("left code will execute");

	}

}
