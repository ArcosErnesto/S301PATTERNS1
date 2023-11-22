package n2ejercicio1;

public class MainN2Ex1 {

	public static void main(String[] args) {
		AbstractFactory spainFactory = FactoryProducer.getFactory("Spain");
		AbstractFactory ukFactory = FactoryProducer.getFactory("UK");

		Contact contact1 = spainFactory.getContact();
		Contact contact2 = ukFactory.getContact();

		contact1.createAddress("Calle de la Rosa, 25, 28001 Madrid, España");
		contact1.createPhone("+34 612 345 678");

		contact2.createAddress("123 High Street, London SW1A 1AA, United Kingdom");
		contact2.createPhone("+44 20 7946 0958");

		System.out.println(contact1);
		System.out.println(contact2);

	}

}
