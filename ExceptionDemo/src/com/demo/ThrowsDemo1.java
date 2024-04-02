package com.demo;

import java.io.IOException;

public class ThrowsDemo1 {

	void method1()throws IOException
	{
		throw new IOException("some hardware problem");
	}
	void method2() throws IOException
	{
		method1();
	}
	
	void method3() throws IOException 
	{
		method2();
	}
	
	public static void main(String[] args) throws IOException {
		
		ThrowsDemo1 td  =new  ThrowsDemo1();
		try
		{
		td.method3();
		}
		catch(IOException e)
		{
			System.out.println("Main method ne handle kiya exception ko");
		}
		System.out.println("left of the code will execute");

	}

}
