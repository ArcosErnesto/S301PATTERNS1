package n1ejercicio1;

public class MainN1Ex1 {

	public static void main(String[] args) {
		Undo obj1 = Undo.getInstance();
		Undo obj2 = Undo.getInstance();

		obj1.listCommand();

		obj2.removeLastComand();

		obj1.addCommand("Command1");
		obj2.addCommand("Command2");
		obj1.addCommand("Command3");

		obj2.listCommand();

		obj1.removeLastComand();

		obj2.listCommand();

	}

}
