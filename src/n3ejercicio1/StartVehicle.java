package n3ejercicio1;

public class StartVehicle implements Action {
	private Vehicle vehicle;

	public StartVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void execute() {
		vehicle.start();
	}
}
