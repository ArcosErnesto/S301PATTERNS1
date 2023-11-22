package n2ejercicio1;

public class FactoryProducer {
	public static AbstractFactory getFactory(String Country) {
		if (Country.equalsIgnoreCase("spain")) {
			return new SpainFactory();
		} else if (Country.equalsIgnoreCase("uk")) {
			return new UkFactory();
		} else {
			System.out.println("No es posible añadir un contacto de este pais: " + Country);
			return null;
		}

	}
}
