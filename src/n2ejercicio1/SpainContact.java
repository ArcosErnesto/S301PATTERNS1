package n2ejercicio1;

public class SpainContact implements Contact {

	private String address;
	private String phone;

	@Override
	public void createAddress(String inputAddress) {
		this.address = inputAddress;

	}

	@Override
	public void createPhone(String inputPhone) {
		this.phone = inputPhone;

	}

	@Override
	public String toString() {
		return "SpainContact:\n" + "Addres: " + address + "\n" + "phone: " + phone + ".\n";
	}

}
