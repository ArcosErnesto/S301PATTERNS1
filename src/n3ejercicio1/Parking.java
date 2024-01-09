package n3ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	private List<Action> vehiclesList = new ArrayList();

	public Parking() {
		System.out.println("Parking creado.");
	}

	public void takeAction(Action action) {
		vehiclesList.add(action);
		System.out.println("Añadida " + action + " a la cola.");
	}

	public void placeAction() {
		System.out.println("Ejecutando lista de Actions.");
		vehiclesList.forEach(action -> action.execute());

		vehiclesList.clear();
	}
}
