package n3ejercicio1;

public class Plane extends Vehicle {

	public Plane(String name) {
		super(name);
		System.out.println("Creado nuevo Plane.");
	}

	@Override
	public void start() {
		System.out.println("El avión " + super.getName() + " está arrancando.");

	}

	@Override
	public void accelerate() {
		System.out.println("El avión " + super.getName() + " está acelerando.");

	}

	@Override
	public void brake() {
		System.out.println("El avión " + super.getName() + " está frenando.");

	}

}
