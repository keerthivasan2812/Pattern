package Chapter4;

public class Client {
	
	private final VehicleFactory factory;
	
	public Client(VehicleFactory factory) {
		this.factory=factory;
	}
	public void moveVehicle() {
		Vehicle vehicle = factory.createVehicle();
		vehicle.move();
	}

}
