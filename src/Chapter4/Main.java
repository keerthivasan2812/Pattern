package Chapter4;

public class Main {
	
	
	public static void main(String[] args) {
		
		VehicleFactory carFactory=new CarFactory();
		
		Client client=new Client(carFactory);
		client.moveVehicle();
		
	}

}
