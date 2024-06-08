package Chapter4;

public class CarFactory implements VehicleFactory {

	

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
