package designpatterns.subject.real;

import designpatterns.subject.Song;

public class RealSubject implements Song {

	private String name;

	public RealSubject(String name) {
		this.name = name;
		System.out.println("loading vast amounts of data from the internet");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void playVideo() {
		System.out.println("play the video that has been downloaded");
	}
	
	@Override
	public void playAudio() {
		System.out.println("play the audio that has been downloaded");
	}

}
