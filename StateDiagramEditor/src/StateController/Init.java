package StateController;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Composite.DiagramElement;
import Composite.StateDiagram;
import Memento.Caretaker;

//initial state

public class Init extends ControllerState {
	//singleton
	private static Init instance = null;

	public Init() {

	}

	public static Init getInstance() {

		if (instance == null) {

			return new Init();
		}

		return instance;

	}

	public ControllerState stateBtnClicked(ActionEvent e) {

		System.out.println("ControllerState stateBtnClicked");

		return AddState.getInstance();
	}

	public ControllerState transBtnClicked(ActionEvent e) {

		return AddTransition.getInstance();

	}

	public ControllerState selectBtnClicked() {

		return this;
	}

	public ControllerState mouseClicked(MouseEvent e, StateDiagram de, Caretaker ct) {

		System.out.println("init mouse clicked");
		
		for (DiagramElement d : de.getComponent()) {
			//when state be clicked, open a dialog to change name for state
			if (d.contains(e.getPoint())) {

				JFrame jj = new JFrame();
				String name = JOptionPane.showInputDialog(jj, "Input the State name: ");

				if (name == null) {

					d.setName("");

				} else {

					d.setName(name);

				}

			}
		}

		return this;
	}

	public ControllerState mouseDragged(MouseEvent e, StateDiagram de) {
		
		//when state be dragged, update the position for state
		for (DiagramElement d : de.getComponent()) {
			if (d.contains(e.getPoint()) && d.isSelected() == true) {

				d.updatePosition(e.getPoint());
				e.getComponent().repaint();

			}
			// d.updatePosition(e.getPoint());
		}

		return this;
	}

	public ControllerState mousePressed(MouseEvent e, StateDiagram de, Caretaker ct) {

		for (DiagramElement d : de.getComponent()) {

			if (e.isShiftDown()) {

			}
		}
		for (DiagramElement d : de.getComponent()) {
			//if state be pressed, display the selection
			if (d.contains(e.getPoint())) {

				d.setSelected(true);

			} else {

				d.setSelected(false);

			}
		}
		return this;
	}

	public ControllerState mouseReleased(MouseEvent e, StateDiagram de, Caretaker ct) {

		System.out.println("controllerstate mouse released");

		return this;
	}

	@Override
	public ControllerState deleteBtnClicked(ActionEvent e) {
		
		System.out.println("Init DeleteBtn Clicked.");
		return TransSourceSelected.getInstance();
		
	}

}
