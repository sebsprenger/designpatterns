package designpatterns.component.decorator.concrete;

import java.util.ArrayList;
import java.util.List;

import designpatterns.component.Car;
import designpatterns.component.CarList;
import designpatterns.component.decorator.CarListFilter;

public class AmericanCars extends CarListFilter {

	public AmericanCars(CarList comp) {
		super(comp);
	}

	@Override
	public List<Car> getCarList() {
		List<Car> americanCars = new ArrayList<>();
		for(Car car : component.getCarList()) {
			if(car.make.equals(Car.Make.DODGE) || car.make.equals(Car.Make.CHEVROLET)) {
				americanCars.add(car);
			}
		}
		return americanCars;
	}

}
