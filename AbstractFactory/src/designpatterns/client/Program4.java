package designpatterns.client;

import designpatterns.factories.FlexibleFactory;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class Program4 {
	
	Window window = new FlexibleFactory().createWindow(Theme.LIGHT);
	Scrollbar scrollbar = new FlexibleFactory().createScrollbar(Theme.LIGHT);
	Button button = new FlexibleFactory().createButton(Theme.LIGHT);
	
}
