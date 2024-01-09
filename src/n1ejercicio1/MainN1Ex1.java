package n1ejercicio1;

public class MainN1Ex1 {

	public static void main(String[] args) {
		Undo obj1 = Undo.getInstance();
		Undo obj2 = Undo.getInstance();

		obj1.listCommand();

		obj2.undo();

		obj1.addCommand("Command1");
		obj2.addCommand("Command2");
		obj1.addCommand("Command3");
		obj2.addCommand("Command4");
		obj1.addCommand("Command5");
		obj2.addCommand("Command6");
		obj1.addCommand("Command7");

		obj2.listCommand();

		obj1.undo();

		obj2.listCommand();

	}

}
