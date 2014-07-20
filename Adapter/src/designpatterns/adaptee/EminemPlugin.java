package designpatterns.adaptee;

public class EminemPlugin implements RapPlugin {

	@Override
	public void looseYourself() {
		System.out.println("You better lose yourself in the music, the moment");
		System.out.println("You own it, you better never let it go");
		System.out.println("You only get one shot, do not miss your chance to blow");
		System.out.println("This opportunity comes once in a lifetime yo");
	}

}
