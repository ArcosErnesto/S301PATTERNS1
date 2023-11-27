package n3ejercicio1;

public class Bicycle extends Vehicle {

	public Bicycle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("La bicicleta " + super.getName() + " está arrancando.");

	}

	@Override
	public void accelerate() {
		System.out.println("La bicicleta " + super.getName() + " está acelerando.");

	}

	@Override
	public void brake() {
		System.out.println("La bicicleta " + super.getName() + " está frenando.");

	}

}
