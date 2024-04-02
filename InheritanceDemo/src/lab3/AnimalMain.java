package lab3;

class wildAnimal {
    
    void move() 
    {
        System.out.println("Running");
    }
}


class Cheetah extends Animal 
{
	void move() 
	{
        System.out.println("Running through a hell...!!");
    }
    
}
public class AnimalMain {

	public static void main(String[] args) {
		
		wildAnimal a = new wildAnimal();
        a.move();
        
        Cheetah c = new Cheetah();
        c.move();
	}

}
