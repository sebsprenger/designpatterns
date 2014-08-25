package designpatterns.component;

public class Car {
	
	public enum Color {
		GREEN, BLUE, RED, YELLOW, ORANGE, VIOLET
	}
	
	public enum Make {
		BMW, VOLKSWAGEN, DODGE, CHEVROLET, TOYOTA, NISSAN
	}
	
	public String model;
	public Color color;
	public Make make;
	
	public Car(Make make, String model, Color color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
}
