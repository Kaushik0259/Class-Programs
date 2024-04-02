package lab3;

class Vehicle
{
	void drive()
	{
		System.out.println("Driving a vehical");
	}
}

class Car extends Vehicle
{
	void drive()// Override the drive method
	{
		System.out.println("Repairing a car");
	}
}

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle v =new Vehicle();
		v.drive();// Call drive method of Vehicle
		
		Car c=new Car();
		c.drive();
	}

}
