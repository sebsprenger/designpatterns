package designpatterns.original.client;

import designpatterns.original.component.Component;
import designpatterns.original.composite.Composite;
import designpatterns.original.leaf.Leaf;


public class Client {
	
	public static void main(String[] args) {
		Component trees = new Composite();
		Component asia = new Composite();
		Component europe = new Composite();
		
		Component banyan = new Leaf("Banyan");
		Component oak = new Leaf("Oak");
		Component pine = new Leaf("Pine");
		Component hawthorn = new Leaf("Hawthorn");
		
		trees.add(asia);
		trees.add(europe);
		
		asia.add(banyan);
		
		europe.add(oak);
		europe.add(pine);
		europe.add(hawthorn);
		
		// throws exception
//		pine.add(oak); 
		
		trees.print();
		asia.print();
		europe.print();
	}

}
