package designpatterns.client;

import designpatterns.factories.Factory;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class Program3 {
	
	Window window = new Factory().createWindow();
	Scrollbar scrollbar = new Factory().createScrollbar();
	Button button = new Factory().createButton();
	
}
