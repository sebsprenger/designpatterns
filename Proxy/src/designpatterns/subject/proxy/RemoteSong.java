package designpatterns.subject.proxy;

import designpatterns.subject.Song;

public class RemoteSong implements Song {

	private String targetIpAddress;
	private String songName;

	public RemoteSong(String ipAddress, String songName) {
		this.targetIpAddress = ipAddress;
		this.songName = songName;
	}

	@Override
	public String getName() {
		return songName;
	}

	@Override
	public void playVideo() {
		System.out.println("sending request to " + targetIpAddress + " to play video for '" + songName + "'");
	}

	@Override
	public void playAudio() {
		System.out.println("sending request to " + targetIpAddress + " to play audio for '" + songName + "'");
	}

}
