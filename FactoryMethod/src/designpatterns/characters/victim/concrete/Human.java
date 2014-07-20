package designpatterns.characters.victim.concrete;

import designpatterns.characters.victim.Victim;

public class Human implements Victim {

	private String name = null;
	
	public Human(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
