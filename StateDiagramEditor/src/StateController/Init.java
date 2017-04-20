package StateController;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import Composite.DiagramElement;

public class Init extends ControllerState{

	private static Init instance = null;
    
	
	public Init() {
		
	}
		
	public static Init getInstance(){
		
		if(instance==null){
			
			return new Init();
		}
		
		return instance;
		
	}
	
	
	


	public ControllerState stateBtnClicked() {
		// TODO Auto-generated method stub
		
		System.out.println("ControllerState stateBtnClicked");
		
		return AddState.getInstance();
	}

	
	public ControllerState transBtnClicked() {
		// TODO Auto-generated method stub
		
		System.out.println("ControllerState transBtnClicked");
		
		return AddTransition.getInstance();
	}
	
	
	
	
	////////////////////////////////////////empty body
	public ControllerState selectBtnClicked() {
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
