package inheritance;

public class Animal {
	public int age; //now this variable is accessible to all other classes of the package. if it is made private, it'll be accessible only to the Animal class
	/*
		we can keep it private and also make it accessible by putting it in a getter
		public int getAge(){ return age;}
		
		this means that a private variable can be accessed by other classes via a public method
	*/
	
	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been created.");
	}
	
	public void eat() {
		System.out.println("Animal is eating.");
	}
	
	public static void main(String[] args) {
		Animal a = new Animal(5);
		Dog d = new Dog(); //dog's age is already set in the dog class file
		Cat c = new Cat(); //cat's age is already set in the dog class file
		d.ruff();
		c.meow();
		a.eat();
		d.eat();
		c.eat();
		d.run();
		c.prance();
		
		
		//Dog k = new Animal();
		//Animal l = new Dog();
	}

}
