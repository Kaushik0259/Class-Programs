package com.demo;

public class ErrorDemo {

	public static void main(String[] args) {
		
		System.out.println("Ye stetement execute hoga");
		try
		{
			Integer i = new Integer("abc");
		}
		catch(NumberFormatException ns)
		{
			System.out.println("sting value hai");
		}
	
		System.out.println("ye statement execution nahi hoga");
	}

}
