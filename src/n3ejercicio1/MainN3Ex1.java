package n3ejercicio1;

public class MainN3Ex1 {

	public static void main(String[] args) {
		Vehicle car = new Car("Seat");
		Vehicle bike = new Bicycle("Orbea");
		Vehicle plane = new Plane("Boeing");
		Vehicle ship = new Ship("Prestige");

		StartVehicle startCar = new StartVehicle(car);
		StartVehicle startBike = new StartVehicle(bike);
		StartVehicle startPlane = new StartVehicle(plane);
		StartVehicle starShip = new StartVehicle(ship);

		AccelerateVehicle accelerateCar = new AccelerateVehicle(car);
		AccelerateVehicle accelerateBike = new AccelerateVehicle(bike);
		AccelerateVehicle acceleratePlane = new AccelerateVehicle(plane);
		AccelerateVehicle accelerateShip = new AccelerateVehicle(ship);

		BrakeVehicle brakeCar = new BrakeVehicle(car);
		BrakeVehicle brakeBike = new BrakeVehicle(bike);
		BrakeVehicle brakePlane = new BrakeVehicle(plane);
		BrakeVehicle brakeShip = new BrakeVehicle(ship);

		Parking parking = new Parking();

		parking.takeAction(startCar);
		parking.takeAction(startBike);
		parking.takeAction(startPlane);
		parking.takeAction(starShip);

		parking.placeAction();

		parking.takeAction(accelerateCar);
		parking.takeAction(accelerateBike);
		parking.takeAction(acceleratePlane);
		parking.takeAction(accelerateShip);

		parking.placeAction();

		parking.takeAction(brakeCar);
		parking.takeAction(brakeBike);
		parking.takeAction(brakePlane);
		parking.takeAction(brakeShip);

		parking.placeAction();
	}

}
