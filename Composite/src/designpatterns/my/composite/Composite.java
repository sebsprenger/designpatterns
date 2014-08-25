package designpatterns.my.composite;

import java.util.ArrayList;
import java.util.List;

import designpatterns.my.component.Container;
import designpatterns.my.component.Function;

public class Composite implements Container {

	private List<Container> children = new ArrayList<>();
	private Function function = null;

	public Composite() {}
	
	public Composite(Function function) {
		this.function = function;
	}

	@Override
	public void add(Container composite) {
		children.add(composite);
	}

	@Override
	public void print() {
		printAllChildren();
		printEmbeddedFunctionObject();
	}

	private void printEmbeddedFunctionObject() {
		if (function != null) {
			function.print();
		}
	}

	private void printAllChildren() {
		for (Function child : children) {
			child.print();
		}
	}

}
