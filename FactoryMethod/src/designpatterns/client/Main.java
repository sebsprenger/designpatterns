package designpatterns.client;

import designpatterns.characters.victim.Victim;
import designpatterns.characters.victim.concrete.Human;
import designpatterns.characters.zombies.Zombie;
import designpatterns.characters.zombies.concrete.AxeZombie;
import designpatterns.characters.zombies.concrete.BaseballBatZombie;

public class Main {
	
	public static void main(String[] args) {
		Victim john = new Human("John");
		Victim jane = new Human("Jane");
		
		Zombie trevor = new AxeZombie();
		Zombie elena = new BaseballBatZombie();
		
		trevor.attack(jane);
		elena.attack(john);
	}
	
	
}
