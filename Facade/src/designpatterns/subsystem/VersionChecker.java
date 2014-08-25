package designpatterns.subsystem;

public class VersionChecker {
	
	public String getNewVersion() {
		System.out.println("retrieving most recent version from server");
		System.out.println("retrieving currently installed version from local machine");
		
		System.out.println("comparing version 30 to version 31");
		System.out.println("there is a new version");
		
		System.out.println("downloading new version");
		return "path/to/new/version/installable";
	}

}
