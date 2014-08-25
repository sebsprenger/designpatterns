package designpatterns.concrete;

import designpatterns.flyweight.Flyweight;

public class ConcreteFlyweight implements Flyweight {

	private char character;

	public ConcreteFlyweight(char intrinsicState) {
		character = intrinsicState;
	}

	@Override
	public String getOutput(String before, String after) {
		return before + character + after;
	}

}
