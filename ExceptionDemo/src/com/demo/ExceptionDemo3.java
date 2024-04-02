package com.demo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		try
		{
		int[]arr= new int[4];
		int i=arr[4];
		
		System.out.println("Muze excecute hona hai");
		}
		catch(ArrayIndexOutOfBoundsException arb)
		{
			System.out.println("Searching number is grater that the define range");
		}
	}

}
