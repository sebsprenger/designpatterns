package designpatterns.client;

import java.util.Scanner;

import designpatterns.facade.SoftwareUpdateFacade;
import designpatterns.subsystem.*;

public class Client {

	public static void main(String[] args) {
		SoftwareUpdateFacade softwareUpdate = new SoftwareUpdateFacade();
		VersionChecker versionChecker = new VersionChecker();

		if (versionChecker.getNewVersion() != null) {
			System.out.println("There is a new version available!");
			System.out.print("do you want to update? (y/n) ");

			String answer = getUserInput();
			
			if(answer.equalsIgnoreCase("y")) {
				softwareUpdate.performUpdate();
			}
		}
		
		System.out.println("program exit");
	}

	private static String getUserInput() {
		String answer = "no";
		Scanner scanIn = new Scanner(System.in);
		while (true) {
			answer = scanIn.nextLine();
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("accepted answers are 'y' and 'n'");
			}
		}
		scanIn.close();
		return answer;
	}

}
