package designpatterns.component.decorator.concrete;

import java.util.ArrayList;
import java.util.List;

import designpatterns.component.Car;
import designpatterns.component.CarList;
import designpatterns.component.decorator.CarListFilter;

public class OrFilter extends CarListFilter {

	private CarList secondFilter; 
	
	public OrFilter(CarList firstFilter, CarList secondFilter) {
		super(firstFilter);
		this.secondFilter = secondFilter;
	}

	@Override
	public List<Car> getCarList() {
		List<Car> mergedList = new ArrayList<>();
		mergedList.addAll(component.getCarList());
		mergedList.addAll(secondFilter.getCarList());
		
		return mergedList;
	}

}
