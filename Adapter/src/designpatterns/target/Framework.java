package designpatterns.target;


public class Framework {

	public void runPlugin(Plugin plugin) {
		printPluginSize(plugin.getSize());
		plugin.run();
	}

	private void printPluginSize(int size) {
		System.out.println("Plugin size: " + size + " MB");
	}
	
}
