package lab3;

class Animal
{
	void makeSound()
	{
		System.out.println("Making a sound");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat be like: Mewo Meow..!!");
	}
}
public class AnimalSound {

	public static void main(String[] args) {
		
		Animal a= new Animal();
		a.makeSound();
		
		Cat c= new Cat();
		c.makeSound();

	}

}
