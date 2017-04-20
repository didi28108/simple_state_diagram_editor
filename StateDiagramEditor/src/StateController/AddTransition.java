package StateController;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import Composite.DiagramElement;

public class AddTransition extends ControllerState{

	private static AddTransition instance = null;
	private static DiagramElement de;
	
	public AddTransition(DiagramElement de) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static AddTransition getInstance(){
		
		if(instance==null){
			
			return new AddTransition(de);
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
		
//		if(de.find(e.getPoint())!=null){
//			
//			transSource = p;
//			
//			return TransSourceSelected.getInstance();
//			
//		}
		
		
		return this;
	}

	
	public ControllerState mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
