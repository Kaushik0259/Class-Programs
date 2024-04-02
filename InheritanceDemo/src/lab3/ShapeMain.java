package lab3;

class Shape
{
	double getArea()
	{
		return 0;
	}
}

class Rectangle extends Shape
{
	double length;
	double width;
	
	Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	
	double getArea()
	{
		return length*width;
	}
}

public class ShapeMain {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(5,10);
		
		double area= r.getArea();
		
		System.out.println("Area of Rectangle:"+ area);
		

	}

}
