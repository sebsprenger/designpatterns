package designpatterns.client;

import java.util.ArrayList;
import java.util.List;

import static designpatterns.component.Car.Color.*;
import static designpatterns.component.Car.Make.*;
import designpatterns.component.Car;
import designpatterns.component.CarList;
import designpatterns.component.concrete.AllCars;
import designpatterns.component.decorator.concrete.AmericanCars;
import designpatterns.component.decorator.concrete.OrFilter;
import designpatterns.component.decorator.concrete.YellowCars;

public class Client {
	
	public static void main(String[] args) {
		
		List<Car> list = createCarList();
		
		CarList allCars = new AllCars(list);
		CarList yellowCars = new YellowCars(allCars);
		CarList americanCars = new AmericanCars(yellowCars);
		
		CarList allAmericanCars = new AmericanCars(allCars);
		CarList americanOrYellowCars = new OrFilter(yellowCars, allAmericanCars);
		
		printList("All Cars", allCars);
		printList("All cars that are yellow", yellowCars);
		printList("All cars that are yellow and American", americanCars);
		
		printList("All cars that are Amerinca", allAmericanCars);
		printList("All cars that are Amerinca or yellow, or both", americanOrYellowCars);
	}

	private static List<Car> createCarList() {
		List<Car> carlist = new ArrayList<>();
		
		carlist.add(new Car(BMW, "3-series", RED));
		carlist.add(new Car(BMW, "3-series", GREEN));
		carlist.add(new Car(BMW, "X5", BLUE));
		carlist.add(new Car(BMW, "X5", ORANGE));
		
		carlist.add(new Car(VOLKSWAGEN, "Golf", VIOLET));
		carlist.add(new Car(VOLKSWAGEN, "Golf", YELLOW));
		carlist.add(new Car(VOLKSWAGEN, "Passat", RED));
		carlist.add(new Car(VOLKSWAGEN, "Passat", GREEN));
		
		carlist.add(new Car(DODGE, "Charger", ORANGE));
		carlist.add(new Car(DODGE, "Charger", YELLOW));
		carlist.add(new Car(DODGE, "Challenger", BLUE));
		carlist.add(new Car(DODGE, "Challenger", GREEN));
		
		carlist.add(new Car(CHEVROLET, "Camaro", YELLOW));
		carlist.add(new Car(CHEVROLET, "Camaro", ORANGE));
		carlist.add(new Car(CHEVROLET, "SS", YELLOW));
		carlist.add(new Car(CHEVROLET, "SS", ORANGE));
		
		carlist.add(new Car(TOYOTA, "Prius", YELLOW));
		carlist.add(new Car(TOYOTA, "Prius", GREEN));
		carlist.add(new Car(TOYOTA, "RAV4", BLUE));
		carlist.add(new Car(TOYOTA, "RAV4", VIOLET));
		
		carlist.add(new Car(NISSAN, "Micra", RED));
		carlist.add(new Car(NISSAN, "Micra", BLUE));
		carlist.add(new Car(NISSAN, "350Z", RED));
		carlist.add(new Car(NISSAN, "350Z", BLUE));
		
		return carlist;
	}

	private static void printList(String title, CarList carlist) {
		System.out.println(title);
		for (Car car : carlist.getCarList()) {
			System.out.println(car.make + " " + car.model + " in " + car.color);
		}
		System.out.println();
	}
	
}
