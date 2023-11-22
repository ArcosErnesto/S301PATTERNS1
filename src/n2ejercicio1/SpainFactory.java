package n2ejercicio1;

public class SpainFactory extends AbstractFactory {

	@Override
	Contact getContact() {

		return new SpainContact();
	}

}
