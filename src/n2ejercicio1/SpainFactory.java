package n2ejercicio1;

public class SpainFactory extends AbstractFactory {

	@Override
	Contact getContact() {
		System.out.println("Creado nuevo SpainContact.");
		return new SpainContact();
	}

}
