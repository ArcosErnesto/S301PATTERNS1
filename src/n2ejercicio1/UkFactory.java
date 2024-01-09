package n2ejercicio1;

public class UkFactory implements AbstractFactory {

	@Override
	public Contact getContact() {
		System.out.println("Creado nuevo UkContact.");
		return new UkContact();
	}

}
