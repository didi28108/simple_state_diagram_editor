package StateController;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Composite.DiagramElement;
import Composite.StateDiagram;
import Composite.Transition;
import Memento.Caretaker;

//if you press the transition button, change to this state 


public class AddTransition extends ControllerState {
	//singleton
	private static AddTransition instance = null;
	private DiagramElement p1;
	private DiagramElement p2;
	private int count = 0;

	public AddTransition() {

	}

	public static AddTransition getInstance() {

		if (instance == null) {

			return new AddTransition();
		}

		return instance;

	}

	public ControllerState selectBtnClicked() {

		return null;
	}

	public ControllerState stateBtnClicked(ActionEvent e) {

		return null;
	}

	public ControllerState transBtnClicked(ActionEvent e) {

		return this;
	}

	public ControllerState mouseClicked(MouseEvent e, StateDiagram de, Caretaker ct) {

		return this;
	}

	public ControllerState mouseDragged(MouseEvent e, StateDiagram de) {

		return this;
	}

	public ControllerState mousePressed(MouseEvent e, StateDiagram de,Caretaker ct) {

		count += 1;
		//when mouse press, get the object  
		System.out.println("trans mouse pressed");

		for (DiagramElement d : de.getComponent()) {
			
			if (d.contains(e.getPoint())) {

				p1 = d;
				System.out.println("trans:" + p1.getLocation());

				if (p2 == null) {

					p2 = d;
					System.out.println("trans:" + p2.getLocation());

				}
			}
		}

		return this;
	}

	public ControllerState mouseReleased(MouseEvent e, StateDiagram de, Caretaker ct) {
		
		 //when the count is 2, add a transition between two state
		 if (count == 2) {

			System.out.println("trans mouse Released");
			
			//create a dialog to gather name for transition
			JFrame jj = new JFrame();
			String name = JOptionPane.showInputDialog(jj, "Input the Transition's name: ");
			
			DiagramElement t = new Transition(name, p1, p2);
			de.add(t);
			// when state diagram add a component the memento would be created
			ct.addMemento(de.CreateMemento());
			// version count
			de.addVersion();
			de.addCurrentVersion();

			e.getComponent().repaint();
			count = 0;//reset the count

			return Init.getInstance();
		}

		return this;
	}

	@Override
	public ControllerState deleteBtnClicked(ActionEvent e) {
		
		return null;
	}

}
