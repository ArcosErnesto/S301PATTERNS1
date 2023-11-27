package n2ejercicio1;

public class UkFactory extends AbstractFactory {

	@Override
	Contact getContact() {
		System.out.println("Creado nuevo UkContact.");
		return new UkContact();
	}

}
