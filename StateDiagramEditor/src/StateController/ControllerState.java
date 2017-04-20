package StateController;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import Composite.DiagramElement;
import Composite.StateDiagram;
import Memento.Caretaker;

public abstract class ControllerState{
	
	public ControllerState(){
		
	}
	
	public ControllerState selectBtnClicked(){
		
		return Init.getInstance();
	}
	
	public abstract ControllerState stateBtnClicked(ActionEvent e);
	public abstract ControllerState transBtnClicked(ActionEvent e);
	public abstract ControllerState deleteBtnClicked(ActionEvent e);
	public abstract ControllerState mouseClicked(MouseEvent e,StateDiagram de,Caretaker ct);
	public abstract ControllerState mouseDragged(MouseEvent e,StateDiagram de);
	public abstract ControllerState mousePressed(MouseEvent e,StateDiagram de,Caretaker ct);
	public abstract ControllerState mouseReleased(MouseEvent e,StateDiagram de,Caretaker ct);
	

}
