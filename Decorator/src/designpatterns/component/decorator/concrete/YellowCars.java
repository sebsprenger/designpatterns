package designpatterns.component.decorator.concrete;

import java.util.ArrayList;
import java.util.List;

import designpatterns.component.Car;
import designpatterns.component.CarList;
import designpatterns.component.decorator.CarListFilter;

public class YellowCars extends CarListFilter {

	public YellowCars(CarList comp) {
		super(comp);
	}

	@Override
	public List<Car> getCarList() {
		List<Car> yellowCars = new ArrayList<>();
		for(Car car : component.getCarList()) {
			if(car.color.equals(Car.Color.YELLOW)) {
				yellowCars.add(car);
			}
		}
		return yellowCars;
	}

}
