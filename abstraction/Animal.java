package abstraction;

public abstract class Animal {
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
	
	public void sleep() {
		System.out.println("An animal is sleeping.");
	}
	
	public abstract void eat();
	
	public static void main(String[] args) {
		//Animal a = new Animal(5); //animal is an abstract class now
		Dog d = new Dog(); //dog's age is already set in the dog class file
		Cat c = new Cat(); //cat's age is already set in the dog class file
		
		d.eat();
		c.eat();
		d.sleep();
		c.sleep();
		
		//casting
		Object dog = new Dog();
		Dog realDog = (Dog) dog; //(type_to_be_converted_to) the_item_to_be_casted;
		realDog.ruff();
		
		Object str = 'Hello World!';
		String realStr = (String) str; //(type_to_be_converted_to) the_item_to_be_casted; 		
		realStr.getBytes();
		
		//what happens if
		Dog doggy = new Dog();
		if(doggy instanceOf Animal) {
			Animal animal = (Animal) doggy; //casting enables the doggy to have access to the methods that belong to the Animal class, but overridden methods are preserved. in this case the sleep method is abstract in the Animal class, hence the sleep method from the Dog class was used to print the animal.sleep() statement
			animal.sleep();
		}
		doggy.sleep();
	}

}
