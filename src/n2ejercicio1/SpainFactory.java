package n2ejercicio1;

public class SpainFactory implements AbstractFactory {

	@Override
	public Contact getContact() {
		System.out.println("Creado nuevo SpainContact.");
		return new SpainContact();
	}

}
