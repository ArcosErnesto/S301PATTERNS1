package n2ejercicio1;

public class UkFactory extends AbstractFactory {

	@Override
	Contact getContact() {
		return new UkContact();
	}

}
