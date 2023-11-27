package n3ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	private List<Action> vehiclesList;

	public Parking() {
		this.vehiclesList = new ArrayList();
	}

	public void takeAction(Action action) {
		vehiclesList.add(action);
	}

	public void placeAction() {
		vehiclesList.forEach(action -> action.execute());

		vehiclesList.clear();
	}
}
