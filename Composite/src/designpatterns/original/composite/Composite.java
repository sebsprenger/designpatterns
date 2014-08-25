package designpatterns.original.composite;

import java.util.ArrayList;
import java.util.List;

import designpatterns.original.component.Component;

public class Composite implements Component {
	
	private List<Component> children = new ArrayList<>();
	
	@Override
	public void print() {
		for(Component child : children) {
			child.print();
		}
	}
	
	@Override
	public void add(Component other) {
		children.add(other);
	}

}
