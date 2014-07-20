package designpatterns.factories;

import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public interface AbstractFactory {
	
	public abstract Window createWindow();
	
	public Scrollbar createScrollbar();
	
	public Button createButton();
}
