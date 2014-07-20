package designpatterns.client;

import designpatterns.factories.AbstractFactory;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class Program8 {
	
	public Program8(AbstractFactory factory) {
		this.factory = factory;
	}
	
	AbstractFactory factory = null;
	
	Window window = factory.createWindow();
	Scrollbar scrollbar = factory.createScrollbar();
	Button button = factory.createButton();
	
}
