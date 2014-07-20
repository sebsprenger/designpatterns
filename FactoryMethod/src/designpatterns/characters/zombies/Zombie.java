package designpatterns.characters.zombies;

import designpatterns.characters.victim.Victim;
import designpatterns.weapons.Weapon;


public abstract class Zombie {
	
	public void attack(Victim victim) {
		Weapon weapon = getWeapon();
		weapon.attack(victim);
	}

	protected abstract Weapon getWeapon();
	
}
