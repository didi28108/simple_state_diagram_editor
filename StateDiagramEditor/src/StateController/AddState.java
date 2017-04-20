package StateController;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import Composite.DiagramElement;
import Composite.State;
import Composite.StateDiagram;
import Composite.Transition;

public class AddState extends ControllerState{

	private static AddState instance = null;
	
	
	public AddState(){
    	
		
		
		
    }
	
	
	public static AddState getInstance(){
		
		if(instance==null){
			
			return new AddState();
		}
		
		return instance;
		
	}
	
	//////////////////////////
	public ControllerState selectBtnClicked() {
		
		return null;
	}

	
	public ControllerState stateBtnClicked() {
		
		return null;
	}

	
	public ControllerState transBtnClicked() {
		
		return null;
	}
	
	
	public ControllerState mouseClicked(MouseEvent e,Graphics g,DiagramElement de) {
		
		System.out.println(e.getPoint());
		//System.out.println(de.getName());
		System.out.println("ControllerState mouseClicked is work");
		
	    State s=new State("p",e.getPoint(),50);
	    de.add(s);
	    s.draw(g);
	    //de.draw(g);
	    //de.printStruct("");
	    //resetCursor();
		
		
		return Init.getInstance();
	}

	/////////////////////////////empty body
	public ControllerState mouseDragged(MouseEvent e) {
		
		return null;
	}

	
	public ControllerState mousePressed(MouseEvent e,DiagramElement de) {
		
		return null;
	}

	
	public ControllerState mouseReleased(MouseEvent e) {
		
		return null;
	}

}
