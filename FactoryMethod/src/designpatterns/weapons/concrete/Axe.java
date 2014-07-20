package designpatterns.weapons.concrete;

import designpatterns.characters.victim.Victim;
import designpatterns.weapons.Weapon;

public class Axe implements Weapon {

	@Override
	public void attack(Victim victim) {
		System.out.println("xxxxing (sound of axe) - hit " + victim);
	}

}
