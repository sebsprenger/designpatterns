package designpatterns.my.leaf;

import designpatterns.my.component.Function;

public class Leaf implements Function {

	private String name = null;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void print() {
		System.out.println("I am a leaf: " + name);
	}

}
