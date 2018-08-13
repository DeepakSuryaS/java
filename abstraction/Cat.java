package abstraction;

public class Cat extends Animal {

	public Cat() {
		super(7);
		System.out.println("A cat has been created.");
	}
	
	public void eat() {
		System.out.println("A cat is eating."); //since we made the eat() method abstract in Animal.java, we have to define it here else we'll get an error
	}
	
	public void meow() {
		System.out.println("A cat meows.");
	}
	
	public void prance() {
		System.out.println("A cat is prancing.");
	}
}
