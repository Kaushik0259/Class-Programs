package com.pacakage1;
// Is-A relationship 
// Has-A relationship // association
class Vehicle
{
	String brand="Maruti"; //Vehicle attribute 
	public void horn()   //vehicle method
	{
		System.out.println("Beep Beep.....!!");
	}
}

public class Car extends Vehicle {
	
	String modelName="Maruti800";

	public static void main(String[] args) {
		
		Car mycar=new Car();// create mycar object
		
		mycar.horn(); // call the horn() method(from the vehicle class) on the my car object    
		
	System.out.println(mycar.brand +": "+ mycar.modelName);

	}

}
