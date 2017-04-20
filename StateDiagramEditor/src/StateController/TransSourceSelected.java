package StateController;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import Composite.DiagramElement;

public class TransSourceSelected extends ControllerState{

	private static TransSourceSelected instance = null;
    private static DiagramElement de;
	
	public TransSourceSelected() {
		
		
	}
	
	
	public static TransSourceSelected getInstance(){
		
		if(instance==null){
			
			return new TransSourceSelected();
		}
		
		return instance;
		
	}
	
	
	public ControllerState selectBtnClicked() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ControllerState stateBtnClicked() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ControllerState transBtnClicked() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ControllerState mouseClicked(MouseEvent e,Graphics g,DiagramElement de) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ControllerState mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ControllerState mousePressed(MouseEvent e,DiagramElement de) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ControllerState mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

}
