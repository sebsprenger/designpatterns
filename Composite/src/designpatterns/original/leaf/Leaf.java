package designpatterns.original.leaf;

import designpatterns.original.component.Component;


public class Leaf implements Component {
	
	private String name = null;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void print() {
		System.out.println("I am a leaf: " + name);
	}

	@Override
	public void add(Component other) {
		throw new IllegalStateException("A leaf does not have any children");
	}

}
