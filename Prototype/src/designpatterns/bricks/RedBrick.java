package designpatterns.bricks;


public class RedBrick extends Brick {
	
	public enum Color {
		RED, GREY, BLACK;
	}
	
	public int height = 200;
	public int length = 50;
	public int width = 100;
	
	public boolean isSolid = true;
	public Color color = Color.RED;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(Integer.toHexString(hashCode()));
		builder.append(" ");
		
		builder.append(height);
		builder.append(" ");
		
		builder.append(length);
		builder.append(" ");
		
		builder.append(isSolid);
		builder.append(" ");
		
		builder.append(color);
		builder.append(" ");
		
		return builder.toString();
	}

}
