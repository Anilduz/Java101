package Cars;


public class Main {

	public static void main(String[] args) {

		Car car = new Car("Benz","E250", 2019, 112233);
		car.setColor("Black");
		car.setTransmission("Auto");
		
		car.showVehicle();
		
	}

}
