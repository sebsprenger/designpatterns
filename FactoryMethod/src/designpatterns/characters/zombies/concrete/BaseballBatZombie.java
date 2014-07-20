package designpatterns.characters.zombies.concrete;

import designpatterns.characters.zombies.Zombie;
import designpatterns.weapons.Weapon;
import designpatterns.weapons.concrete.BaseballBat;

public class BaseballBatZombie extends Zombie {

	@Override
	protected Weapon getWeapon() {
		return new BaseballBat();
	}

}
