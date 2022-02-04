package carsaledemoapp.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarDetails {
	private int carID;
	private String carName;
	private String carModel;
	private String carValue;

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarValue() {
		return carValue;
	}

	public void setCarValue(String carValue) {
		this.carValue = carValue;
	}
	
	@Override
	public String toString() {
		return "CarDetails [carID=" + carID + ", carName=" + carName + ", carModel=" + carModel + ", carValue="
				+ carValue + "]";
	}
}
