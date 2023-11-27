package n3ejercicio1;

public class BrakeVehicle implements Action {
	private Vehicle vehicle;

	public BrakeVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.brake();
	}

}
