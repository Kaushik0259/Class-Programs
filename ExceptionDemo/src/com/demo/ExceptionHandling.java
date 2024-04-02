package com.demo;
/*Marker interfaces - Doesn't have any methods or constant inside it.
 * It provide run time type information about objects;
 * so the compiler and JVM have additional information about the object.
 * Class extends class
 * class implements interfaces
 * interfaces extends interface
 */
interface child
{
	
}

class abc
{
	
}

public class ExceptionHandling extends abc implements child  {

	public static void main(String[] args) {
		
		System.out.println("ye statement print hoga");
		 

	}

}
