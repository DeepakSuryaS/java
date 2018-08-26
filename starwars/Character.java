package starwars;

public interface Character {

	//properties created in interfaces are static and can't be changed
	public String base = "Character";
	public void attack();
	public void heal();
	public String getWeapon();

}
