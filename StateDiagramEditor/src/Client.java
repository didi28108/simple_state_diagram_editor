import Composite.DiagramElement;
import Composite.StateDiagram;
import Controller.Controller;
import GUI.View;
import Memento.Caretaker;
import StateController.AddState;
import StateController.ControllerState;
import StateController.Init;

public class Client {
	
	private View v;
	private Controller c;
	private ControllerState cs; 
	private Caretaker caretaker;
	
	public static void main(String[] args) {
		
		Caretaker caretaker = new Caretaker();
	
		View v = new View();
		ControllerState cs = new Init();//new a initial state for state diagram editor
		Controller c = new Controller(v,cs,new StateDiagram("root"),caretaker);
		
		v.frame.setVisible(true);

	}

}
