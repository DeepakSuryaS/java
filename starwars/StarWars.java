package starwars;

import java.util.Random;

public class StarWars {

	public static Character summonCharacter () {
		Random rand = new Random();
		if(Math.abs(rand.nextInt()) % 2 == 0) {
			return new Enemy();
		} else {
			return new Hero();
		}
	}
	
	public static void main(String[] args) {
		Enemy darthVader = new Enemy();
		Hero obiWanKenubi = new Hero();
		darthVader.attack();
		obiWanKenubi.attack();
		darthVader.heal();
		obiWanKenubi.heal();
		System.out.println("Enemy weapon : " + darthVader.getWeapon());
		System.out.println("Hero weapon : " + obiWanKenubi.getWeapon());		
		Character spy = summonCharacter();
		spy.attack();
	}

}
