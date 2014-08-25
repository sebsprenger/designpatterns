package designpatterns.client;

import java.util.Scanner;

import designpatterns.subject.Song;
import designpatterns.subject.proxy.LazySong;
import designpatterns.subject.proxy.PermissionSong;
import designpatterns.subject.proxy.RemoteSong;
import designpatterns.subject.real.RealSubject;

public class Client {

	private static Scanner inputScanner = null;

	public static void main(String[] args) {

		try {
			inputScanner = new Scanner(System.in);

			Song virtual = new LazySong("Without Me");

			playAudio(virtual);
			playVideo(virtual);

			System.out.println();

			Song permission = new PermissionSong(new RealSubject("Sing For The Moment"));
			playAudio(permission);
			playVideo(permission);

			System.out.println();

			Song remote = new RemoteSong("192.168.174.14", "Sing For The Moment");
			playAudio(remote);
			playVideo(remote);

			System.out.println();
			
			inputScanner.close();
			System.out.println("Program exit.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void playVideo(Song song) {
		System.out.println("Do you want to watch the video named: "
				+ song.getName() + "? (y/n)");
		if (getUserInput().equals("y")) {
			song.playVideo();
		}
	}

	private static void playAudio(Song song) {
		System.out.println("Do you want to watch the audio named: "
				+ song.getName() + "? (y/n)");
		if (getUserInput().equals("y")) {
			song.playAudio();
		}
	}

	private static String getUserInput() {
		String answer = "no";
		while (true) {
			answer = inputScanner.nextLine();
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("accepted answers are 'y' and 'n'");
			}
		}
		return answer;
	}
}
