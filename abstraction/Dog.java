package abstraction;

public class Dog extends Animal {

	public Dog() {
		super(15);
		System.out.println("A Dog is created.");
	}
	
	public void eat() {
		System.out.println("A dog is eating."); //since we made the eat() method abstract in Animal.java, we have to define it here else we'll get an error
	}
	
	public void ruff() {
		System.out.println("The dog says ruff.");
	}
	
	public void run() {
		System.out.println("The dog is running.");
	}
	
	
	//for methods that override the original method the access modifier, the return type and the name of the method (all these make up the signature of the method) should be similar
	public void sleep() { //this method overrides the sleep method in the animal class
		System.out.println("A dog is sleeping.");
	}

}
