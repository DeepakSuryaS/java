package starwars;

public class Enemy implements Character {

	public String weapon = "Lightsaber";

	//constructor
	public Enemy () {

	}

	//we can't choose which method to implement, we have to implement all the methods here
	//methods need to have the exact same signature
	
	@Override
	public void attack () {
		System.out.println("The enemy attacks you.");
	}

	@Override
	public void heal () {
		System.out.println("The enemy heals himself.");
	}

	public void weaponDraw () {
		System.out.println("Draw out weapon!");
	}

	@Override
	public String getWeapon () {
		return weapon;
	}

}
