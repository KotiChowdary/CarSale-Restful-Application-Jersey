package carsaledemoapp.repository;

import java.util.ArrayList;
import java.util.List;

import carsaledemoapp.beans.CarDetails;

public class CarRepository {
	List<CarDetails> carRepo;
	
	public CarRepository() {
		CarDetails audiCar = new CarDetails();
		audiCar.setCarID(1001);
		audiCar.setCarName("Audi");
		audiCar.setCarModel("Audi A4");
		audiCar.setCarValue("£45000");
		CarDetails bmwCar = new CarDetails();
		bmwCar.setCarID(1002);
		bmwCar.setCarName("BMW");
		bmwCar.setCarModel("BMW 7 Series");
		bmwCar.setCarValue("£55000");
		carRepo = new ArrayList<CarDetails>();
		carRepo.add(audiCar);
		carRepo.add(bmwCar);
	}
	
	public List<CarDetails> getCars() {
		return carRepo;
	}
	
	public CarDetails getCar(int carID) {
		for(int i=0;i<carRepo.size();i++) {
			if(carRepo.get(i).getCarID()==carID) {
				return carRepo.get(i);
			}
		}
		return null;
	}
}
