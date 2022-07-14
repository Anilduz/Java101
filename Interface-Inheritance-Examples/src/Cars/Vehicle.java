package Cars;

public abstract class Vehicle {

	String make, model, transmisson, color;
	int year;
	
	
	public Vehicle(String make, String model, int year) {
	
		this.make = make;
		this.model = model;
		this.year = year;
	}


	public abstract void showVehicle();

	
}
