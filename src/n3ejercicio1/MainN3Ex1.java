package n3ejercicio1;

public class MainN3Ex1 {

	public static void main(String[] args) {
		System.out.println("Creando los objetos Vehicle:");
		Vehicle car = new Car("Seat");
		Vehicle bike = new Bicycle("Orbea");
		Vehicle plane = new Plane("Boeing");
		Vehicle ship = new Ship("Prestige");

		System.out.println("\nCreando nuevas Actions:");
		StartVehicle startCar = new StartVehicle(car);
		StartVehicle startBike = new StartVehicle(bike);
		StartVehicle startPlane = new StartVehicle(plane);
		StartVehicle starShip = new StartVehicle(ship);

		System.out.println("");
		AccelerateVehicle accelerateCar = new AccelerateVehicle(car);
		AccelerateVehicle accelerateBike = new AccelerateVehicle(bike);
		AccelerateVehicle acceleratePlane = new AccelerateVehicle(plane);
		AccelerateVehicle accelerateShip = new AccelerateVehicle(ship);

		System.out.println("");
		BrakeVehicle brakeCar = new BrakeVehicle(car);
		BrakeVehicle brakeBike = new BrakeVehicle(bike);
		BrakeVehicle brakePlane = new BrakeVehicle(plane);
		BrakeVehicle brakeShip = new BrakeVehicle(ship);

		System.out.println("\nCreando nuevo Parking.");
		Parking parking = new Parking();

		System.out.println("\nAñadiendo Actions a Parking:");
		parking.takeAction(startCar);
		parking.takeAction(startBike);
		parking.takeAction(startPlane);
		parking.takeAction(starShip);
		System.out.println("");
		parking.takeAction(accelerateCar);
		parking.takeAction(accelerateBike);
		parking.takeAction(acceleratePlane);
		parking.takeAction(accelerateShip);

		System.out.println("");
		parking.takeAction(brakeCar);
		parking.takeAction(brakeBike);
		parking.takeAction(brakePlane);
		parking.takeAction(brakeShip);
		System.out.println("");
		parking.placeAction();
	}

}
