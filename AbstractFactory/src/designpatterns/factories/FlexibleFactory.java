package designpatterns.factories;

import designpatterns.client.Theme;
import designpatterns.darktheme.DarkThemeButton;
import designpatterns.darktheme.DarkThemeScrollbar;
import designpatterns.darktheme.DarkThemeWindow;
import designpatterns.lighttheme.LightThemeButton;
import designpatterns.lighttheme.LightThemeScrollbar;
import designpatterns.lighttheme.LightThemeWindow;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class FlexibleFactory {

	public Window createWindow(Theme theme) {
		if (theme == Theme.LIGHT) {
			return new LightThemeWindow();
		} else {
			return new DarkThemeWindow();
		}
	}

	public Scrollbar createScrollbar(Theme theme) {
		if (theme == Theme.LIGHT) {
			return new LightThemeScrollbar();
		} else {
			return new DarkThemeScrollbar();
		}
	}

	public Button createButton(Theme theme) {
		if (theme == Theme.LIGHT) {
			return new LightThemeButton();
		} else {
			return new DarkThemeButton();
		}
	}
}
