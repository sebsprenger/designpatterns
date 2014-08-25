package designpatterns.factory;

import java.util.HashMap;
import java.util.Map;

import designpatterns.concrete.ConcreteFlyweight;
import designpatterns.flyweight.Flyweight;

public class ProductFactory {

	private Map<Character, Flyweight> existingObjects = new HashMap<>();
	
	public Flyweight getFlyweight(Character intrinsicState) {
		Flyweight result = existingObjects.get(intrinsicState);
		if (result == null) {
			result = new ConcreteFlyweight(intrinsicState);
			existingObjects.put(intrinsicState, result);
		}
		return result;
	}
	
	public int getAmountOfCreatedObjects() {
		return existingObjects.size();
	}
	
}
