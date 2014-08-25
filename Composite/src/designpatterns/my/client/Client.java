package designpatterns.my.client;

import designpatterns.my.composite.Composite;
import designpatterns.my.leaf.Leaf;

public class Client {
	public static void main(String[] args) {
		Composite trees = new Composite();
		Composite asia = new Composite();
		Composite europe = new Composite();
		
		Composite banyan = new Composite(new Leaf("Banyan"));
		Composite oak = new Composite(new Leaf("Oak"));
		Composite pine = new Composite(new Leaf("Pine"));
		Composite hawthorn = new Composite(new Leaf("Hawthorn"));
		
		trees.add(asia);
		trees.add(europe);
		
		asia.add(banyan);
		
		europe.add(oak);
		europe.add(pine);
		europe.add(hawthorn);
		
		// which is sort of okay
		pine.add(oak);
		
		trees.print();
	}
}
