package Chapter4;

public class TruckFactory implements VehicleFactory {

	

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Truck();
	}

}
