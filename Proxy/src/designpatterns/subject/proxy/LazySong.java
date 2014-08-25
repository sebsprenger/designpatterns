package designpatterns.subject.proxy;

import designpatterns.subject.Song;
import designpatterns.subject.real.RealSubject;

public class LazySong implements Song {

	private RealSubject subject = null;
	private String name = null;
	
	public LazySong(String name) {
		this.name = name;
	}

	@Override
	public void playVideo() {
		highCostOperation().playVideo();
	}

	private RealSubject highCostOperation() {
		if(subject == null) {
			subject = new RealSubject(name);
		}
		return subject;
	}

	@Override
	public String getName() {
		if(subject == null) {
			return this.name;
		} else {
			return subject.getName();
		}
		
	}

	@Override
	public void playAudio() {
		highCostOperation().playAudio();
	}
	
}
