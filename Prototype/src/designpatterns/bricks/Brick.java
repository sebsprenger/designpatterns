package designpatterns.bricks;

public abstract class Brick implements Cloneable {
	
	@Override
	public Brick clone() {
		Brick result = null;
		try {
			 result = (Brick) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}