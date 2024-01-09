package n3ejercicio1;

public class StartVehicle implements Action {
	private Vehicle vehicle;

	public StartVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		System.out.println("Creada Action StartVehicle para " + vehicle.getName() + ".");
	}

	public void execute() {
		vehicle.start();
	}

	@Override
	public String toString() {
		return "StartVehicle [vehicle=" + vehicle.getName() + "]";
	}

}
