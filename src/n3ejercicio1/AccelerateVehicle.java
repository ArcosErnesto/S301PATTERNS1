package n3ejercicio1;

public class AccelerateVehicle implements Action {
	private Vehicle vehicle;

	public AccelerateVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void execute() {
		vehicle.accelerate();
	}
}
