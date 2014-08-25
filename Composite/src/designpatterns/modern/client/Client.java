package designpatterns.modern.client;

import designpatterns.modern.leaf.Leaf;
import designpatterns.modern.component.Component;
import designpatterns.modern.composite.Composite;

public class Client {
	
	public static void main(String[] args) {
		Component trees = new Composite();
		Component asia = new Composite();
		Component europe = new Composite();
		
		Component banyan = new Leaf("Banyan");
		Component oak = new Leaf("Oak");
		Component pine = new Leaf("Pine");
		Component hawthorn = new Leaf("Hawthorn");
		
		Composite treeComposite = null;
		if (trees.isComposite()) {
			treeComposite = (Composite) trees;
		}
		
		Composite asiaComposite = null;
		if (asia.isComposite()) {
			asiaComposite = (Composite) asia;
		}
		
		Composite europeComposite = null;
		if (europe.isComposite()) {
			europeComposite = (Composite) europe;
		}
		
		treeComposite.add(asiaComposite);
		treeComposite.add(europeComposite);
		
		asiaComposite.add(banyan);
		
		europeComposite.add(oak);
		europeComposite.add(pine);
		europeComposite.add(hawthorn);
		
		trees.print();
		treeComposite.print();
	}

}
