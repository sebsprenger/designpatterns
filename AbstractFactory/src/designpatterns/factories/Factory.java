package designpatterns.factories;

import designpatterns.darktheme.DarkThemeButton;
import designpatterns.darktheme.DarkThemeScrollbar;
import designpatterns.darktheme.DarkThemeWindow;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class Factory {
	
	public Window createWindow() {
		return new DarkThemeWindow();
	}
	
	public Scrollbar createScrollbar() {
		return new DarkThemeScrollbar();
	}
	
	public Button createButton() {
		return new DarkThemeButton();
	}
}
