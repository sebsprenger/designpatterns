package designpatterns.client;

import designpatterns.factories.MoreFlexibleFactory;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class Program6 {
	
	Theme usingTheme = Theme.LIGHT;
	MoreFlexibleFactory factory = new MoreFlexibleFactory(usingTheme);
	
	Window window = factory.createWindow();
	Scrollbar scrollbar = factory.createScrollbar();
	Button button = factory.createButton();
	
}
