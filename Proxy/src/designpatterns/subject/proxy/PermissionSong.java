package designpatterns.subject.proxy;

import designpatterns.subject.Song;
import designpatterns.subject.real.RealSubject;

public class PermissionSong implements Song {

	private RealSubject subject;
	
	public PermissionSong(RealSubject subject) {
		this.subject = subject;
	}

	@Override
	public void playVideo() {
		throw new IllegalAccessError("no high cost calls allowed!");
	}
	
	@Override
	public void playAudio() {
		subject.playAudio();
	}

	@Override
	public String getName() {
		return subject.getName();
	}
	
}
