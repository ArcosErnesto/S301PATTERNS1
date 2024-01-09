package n3ejercicio1;

public class Car extends Vehicle {

	public Car(String name) {
		super(name);
		System.out.println("Creado nuevo Car.");
	}

	@Override
	public void start() {
		System.out.println("El coche " + super.getName() + " está arrancando.");

	}

	@Override
	public void accelerate() {
		System.out.println("El coche " + super.getName() + " está acelerando.");

	}

	@Override
	public void brake() {
		System.out.println("El coche " + super.getName() + " está frenando.");

	}

}
