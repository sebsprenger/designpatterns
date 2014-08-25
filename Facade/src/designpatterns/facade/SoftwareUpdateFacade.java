package designpatterns.facade;

import designpatterns.subsystem.*;

public class SoftwareUpdateFacade {
	
	public void performUpdate() {
		VersionChecker versionChecker = new VersionChecker();
		String softwareInstallable = versionChecker.getNewVersion();
		
		if ( softwareInstallable != null ) {
			TaskManager taskManager = new TaskManager();
			SoftwareUpdate softwareUpdate = new SoftwareUpdate();
			
			taskManager.stopAcceptingNewTasks();
			softwareUpdate.install(softwareInstallable);
			softwareUpdate.restartSystem();
		}
		
		
	}

}
