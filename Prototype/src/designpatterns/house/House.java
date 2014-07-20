package designpatterns.house;

import designpatterns.bricks.Brick;

public class House {

	private Brick prototype = null;
	
	public House(Brick brick) {
		prototype = brick;
	}
	
	public void createWall() {
		
		Brick w1 = prototype.clone();
		Brick w2 = prototype.clone();
		Brick w3 = prototype.clone();
		Brick w4 = prototype.clone();
		
		// ... do something more complex with the bricks
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
	}

}
