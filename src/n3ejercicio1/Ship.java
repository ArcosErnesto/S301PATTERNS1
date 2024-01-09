package n3ejercicio1;

public class Ship extends Vehicle {

	public Ship(String name) {
		super(name);
		System.out.println("Creado nuevo Ship.");
	}

	@Override
	public void start() {
		System.out.println("El barco " + super.getName() + " está arrancando.");

	}

	@Override
	public void accelerate() {
		System.out.println("El barco " + super.getName() + " está acelerando.");

	}

	@Override
	public void brake() {
		System.out.println("El barco " + super.getName() + " está frenando.");

	}

}
