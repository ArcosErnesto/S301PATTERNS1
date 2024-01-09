package n3ejercicio1;

public class AccelerateVehicle implements Action {
	private Vehicle vehicle;

	public AccelerateVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		System.out.println("Creada Action AccelerateVehicle para " + vehicle.getName() + ".");
	}

	public void execute() {
		vehicle.accelerate();
	}

	@Override
	public String toString() {
		return "AccelerateVehicle [vehicle=" + vehicle.getName() + "]";
	}

}
