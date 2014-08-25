package designpatterns.modern.leaf;

import designpatterns.modern.component.Component;

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
	public boolean isComposite() {
		return false;
	}


}
