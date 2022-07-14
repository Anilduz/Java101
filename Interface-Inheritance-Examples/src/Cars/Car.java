package Cars;

public class Car extends Vehicle implements IBody, IEngine{

		
	int numPlate;
	
	
	public Car(String make, String model, int year, int numberPlate) {
		super(make, model, year);
		this.numPlate = numberPlate;
	}
	
	@Override
	public void setTransmission(String transmission) {
		this.transmisson = transmission;
	}

	@Override
	public void getTransmission() {
		System.out.println(this.transmisson);		
	}

	@Override
	public void setColor(String color) {
		this.color = color;		
	}

	@Override
	public void getColor() {
		System.out.println(this.color);		
	}

	@Override
	public void showVehicle() {
		System.out.println(this.make);		
		System.out.println(this.model);
		System.out.println(this.year);
		System.out.println(this.numPlate);
		this.getColor();
		this.getTransmission();



	}
	
	
	
}
