package designpatterns.subsystem;

public class TaskManager {
	
	public void stopAcceptingNewTasks() {
		System.out.println("stopping accepting new tasks.");
		System.out.println("\tall existing task will run until they are finished");
	}

}
