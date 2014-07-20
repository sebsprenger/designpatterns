package designpatterns.weapons.concrete;

import designpatterns.characters.victim.Victim;
import designpatterns.weapons.Weapon;


public class BaseballBat implements Weapon {

	@Override
	public void attack(Victim victim) {
		System.out.println("ddfffff (sound of baseball bat) - hit " + victim);
	}

}
