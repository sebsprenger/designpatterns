package designpatterns.client;

import designpatterns.factories.FlexibleFactory;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class Program5 {
	
	Theme usingTheme = Theme.LIGHT;
	FlexibleFactory factory = new FlexibleFactory();
	
	Window window = factory.createWindow(usingTheme);
	Scrollbar scrollbar = factory.createScrollbar(usingTheme);
	Button button = factory.createButton(usingTheme);
	
}
