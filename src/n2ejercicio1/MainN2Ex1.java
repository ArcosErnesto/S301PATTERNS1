package n2ejercicio1;

public class MainN2Ex1 {

	public static void main(String[] args) {
		System.out.println("Creamos dos factorys con Abstract Factory.");
		AbstractFactory spainFactory = FactoryProducer.getFactory("Spain");
		AbstractFactory ukFactory = FactoryProducer.getFactory("UK");

		System.out.println("\nCreamos contactos.");
		Contact contact1 = spainFactory.getContact();
		Contact contact2 = ukFactory.getContact();
		Contact contact3 = spainFactory.getContact();
		Contact contact4 = ukFactory.getContact();

		System.out.println("\nAñadimos y mostramos datos.");
		contact1.createAddress("Calle de la Rosa, 25, 28001 Madrid, España");
		contact1.createPhone("+34 612 345 678");

		contact2.createAddress("123 High Street, London SW1A 1AA, United Kingdom");
		contact2.createPhone("+44 20 7946 0958");

		contact3.createAddress("Avenida del Sol, 15, 41001 Sevilla, España");
		contact3.createPhone("+34 622 987 654");

		contact4.createAddress("456 Main Street, Manchester M1 1AA, United Kingdom");
		contact4.createPhone("+44 161 234 5678");

		System.out.println(contact1);
		System.out.println(contact2);
		System.out.println(contact3);
		System.out.println(contact4);

	}

}
