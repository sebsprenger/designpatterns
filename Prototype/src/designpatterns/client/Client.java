package designpatterns.client;

import designpatterns.bricks.RedBrick;
import designpatterns.bricks.RedBrick.Color;
import designpatterns.house.House;

public class Client {

	public static void main(String[] args) {
		
		RedBrick brick = new RedBrick();
		brick.height = 200;
		brick.length = 50;
		brick.isSolid = true;
		brick.color = Color.RED;
		
		House house = new House(brick);
		house.createWall();
		// ...
	}

}
