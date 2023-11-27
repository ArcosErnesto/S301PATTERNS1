package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

	private static Undo instance;
	private List<String> commandHistory;

	private Undo() {
		commandHistory = new ArrayList<>();
	}

	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
			System.out.println("Creando instancia.\n");
		} else {
			System.out.println("Instancia ya creada\n");
		}
		return instance;
	}

	public void addCommand(String command) {
		commandHistory.add(command);
		System.out.println("Anadido " + command + " a commandHistory.\n");
	}

	public void listCommand() {
		if (commandHistory.isEmpty()) {
			System.out.println("commandHistory está vacio.");
		} else {
			System.out.println("commandHistory:");
			for (String command : commandHistory) {
				System.out.println(command);
			}
		}

		System.out.println("");
	}

	public void undo() {
		if (commandHistory.isEmpty()) {
			System.out.println("No se puede deshacer, commandHistory está vacio.\n");
		} else {
			String removedCommand = commandHistory.remove(commandHistory.size() - 1);
			System.out.println("Eliminada " + removedCommand + " de commandHistory.\n");
		}

	}

}
