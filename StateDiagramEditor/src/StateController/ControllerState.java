package StateController;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import Composite.DiagramElement;

public abstract class ControllerState{
	
	
	
	
	public ControllerState(){
		
		
		
	}
	

	public ControllerState selectBtnClicked(){
		
		return Init.getInstance();
	}
	
	public abstract ControllerState stateBtnClicked();
	public abstract ControllerState transBtnClicked();
	
	public abstract ControllerState mouseClicked(MouseEvent e,Graphics g,DiagramElement de);
	public abstract ControllerState mouseDragged(MouseEvent e);
	public abstract ControllerState mousePressed(MouseEvent e,DiagramElement de);
	public abstract ControllerState mouseReleased(MouseEvent e);
	

}
