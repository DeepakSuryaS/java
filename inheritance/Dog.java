package inheritance;

public class Dog extends Animal {

	public Dog() {
		super(15);
		System.out.println("A Dog is created.");
	}
	
	public void ruff() {
		System.out.println("The dog says ruff.");
	}
	
	public void run() {
		System.out.println("The dog is running.");
	}

}
