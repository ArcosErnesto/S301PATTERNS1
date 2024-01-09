package n3ejercicio1;

public class BrakeVehicle implements Action {
	private Vehicle vehicle;

	public BrakeVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		System.out.println("Creada Action BrakeVehicle para " + vehicle.getName() + ".");
	}

	@Override
	public void execute() {
		vehicle.brake();
	}

	@Override
	public String toString() {
		return "BrakeVehicle [vehicle=" + vehicle.getName() + "]";
	}

}
