public class Car {

	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079;
	boolean isTheCarOn = false;
	char condition = 'A';
	String name = "Aston Martin";
	int maxFuel = 18;
	double currentFuel = 8.9;
	double mpg = 28;
	int numberOfPeopleInCar = 1;
	int maxNumberOfPeopleInCar = 5;
	
	public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn ) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}
	
	public void printVariables() {
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(numberOfPeopleInCar);
		System.out.println(name);
	}	
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public int setMaxSpeed(int newMaxSpeed) {
		this.maxSpeed = newMaxSpeed;
	}
	
	public int getMinSpeed() {
		return this.minSpeed;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public boolean getIsTheCarOn() {
		return this.isTheCarOn;
	}
	
	public void upgradeMinSpeed() {
		setMaxSpeed(getMaxSpeed() + 10);
	}
	
	public void getIn() {
		if(numberOfPeopleInCar < maxNumberOfPeopleInCar) numberOfPeopleInCar++;
		else System.out.println("The car is full.");
	}
	
	public void getOut() {
		if(numberOfPeopleInCar > 0) numberOfPeopleInCar--;
		else System.out.println("There's no one in the car at all.");
	}
	
	public double milesTillOutOfGas() {
		return currentFuel * mpg;
	}
	
	public static void main(String args[]) {
		
		//creating a new instance of the Car class
		Car familyCar = new Car(600, 5000, false);
		System.out.println("Family car v1: ");
		familyCar.printVariables();
		familyCar.getIn();
		familyCar.getIn();
		familyCar.getIn();
		double needGas = familyCar.milesTillOutOfGas();
		System.out.println("Family car v2: ");
		familyCar.printVariables();
		System.out.println("We'll be out of gas in " + needGas + " miles.");
	}
}
