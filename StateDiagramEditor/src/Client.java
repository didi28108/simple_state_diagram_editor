import Composite.DiagramElement;
import Composite.StateDiagram;
import Controller.Controller;
import GUI.View;
import StateController.AddState;
import StateController.ControllerState;
import StateController.Init;

public class Client {
	
	private View v;
	private Controller c;
	private ControllerState cs; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiagramElement root = new StateDiagram("root");
		
		View v = new View();
		ControllerState cs = new Init();
		Controller c = new Controller(v,cs,root);
		
		v.setVisible(true);

	}

}
