package designpatterns.client;

import designpatterns.factories.AbstractFactory;
import designpatterns.factories.LightThemeFactory;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class Program7 {
	
	AbstractFactory factory = new LightThemeFactory();
	
	Window window = factory.createWindow();
	Scrollbar scrollbar = factory.createScrollbar();
	Button button = factory.createButton();
	
}
