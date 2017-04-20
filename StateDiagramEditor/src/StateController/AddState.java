package StateController;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import Composite.DiagramElement;
import Composite.State;
import Composite.StateDiagram;
import Memento.Caretaker;

//if you press the state button, change to this state 

public class AddState extends ControllerState {
	//singleton
	private static AddState instance = null;

	public AddState() {

	}

	public static AddState getInstance() {

		if (instance == null) {

			return new AddState();
		}

		return instance;

	}

	public ControllerState selectBtnClicked() {

		return null;
	}

	public ControllerState stateBtnClicked(ActionEvent e) {

		return this;
	}

	public ControllerState transBtnClicked(ActionEvent e) {

		return null;
	}

	public ControllerState mouseClicked(MouseEvent e, StateDiagram de, Caretaker ct) {

		System.out.println(e.getPoint());
		System.out.println("ControllerState mouseClicked is work");
		DiagramElement s = new State("state", e.getPoint(), 35);

		de.add(s);
		// when state diagram add a component the memento would be created
		ct.addMemento(de.CreateMemento());
		// version count + 1
		de.addVersion();
		de.addCurrentVersion();

		return Init.getInstance();
	}

	public ControllerState mouseDragged(MouseEvent e, StateDiagram sd) {

		return this;
	}

	public ControllerState mousePressed(MouseEvent e, StateDiagram de,Caretaker ct) {

		return this;
	}

	public ControllerState mouseReleased(MouseEvent e, StateDiagram sd, Caretaker ct) {

		return this;
	}

	@Override
	public ControllerState deleteBtnClicked(ActionEvent e) {
		
		return null;
	}

}
