package designpatterns.subsystem;

public class SoftwareUpdate {

	public void install(String softwareInstallable) {
		System.out.println("installing " + softwareInstallable);
	}

	public void restartSystem() {
		System.out.println("initiating program restart to activate new version");
	}

}
