package designpatterns.component.concrete;

import java.util.List;

import designpatterns.component.Car;
import designpatterns.component.CarList;

public class AllCars implements CarList {
	
	private List<Car> carlist;
	
	public AllCars(List<Car> carlist) {
		this.carlist = carlist;
	}

	@Override
	public List<Car> getCarList() {
		return carlist;
	}

}
