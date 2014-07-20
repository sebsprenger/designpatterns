package designpatterns.characters.zombies.concrete;

import designpatterns.characters.zombies.Zombie;
import designpatterns.weapons.Weapon;
import designpatterns.weapons.concrete.Axe;


public class AxeZombie extends Zombie {
	
	@Override
	protected Weapon getWeapon() {
		return new Axe();
	}
}
