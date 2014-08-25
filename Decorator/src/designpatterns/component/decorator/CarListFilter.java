package designpatterns.component.decorator;

import designpatterns.component.CarList;

public abstract class CarListFilter implements CarList {
	
	protected CarList component;
	
	public CarListFilter(CarList comp) {
		this.component = comp;
	}

}
