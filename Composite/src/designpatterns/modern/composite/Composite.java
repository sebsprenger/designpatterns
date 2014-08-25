package designpatterns.modern.composite;

import java.util.ArrayList;
import java.util.List;

import designpatterns.modern.component.Component;

public class Composite implements Component {
	
	private List<Component> children = new ArrayList<>();
	
	@Override
	public void print() {
		for(Component child : children) {
			child.print();
		}
	}
	
	public void add(Component other) {
		children.add(other);
	}

	@Override
	public boolean isComposite() {
		return true;
	}

}
