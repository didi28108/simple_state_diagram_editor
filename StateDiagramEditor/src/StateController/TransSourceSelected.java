package StateController;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import Composite.DiagramElement;
import Composite.StateDiagram;
import Memento.Caretaker;

//if you press the delete button, change to this state 

public class TransSourceSelected extends ControllerState{
	//singleton
	private static TransSourceSelected instance = null;
    
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

	
	public ControllerState stateBtnClicked(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ControllerState transBtnClicked(ActionEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ControllerState deleteBtnClicked(ActionEvent e) {
		
		return this;
	}

	public ControllerState mouseClicked(MouseEvent e, StateDiagram de, Caretaker ct) {
//		System.out.println("TranSourceSelected Mouse Clicked!!!");
//		for (DiagramElement d : de.getComponent()) {
//			if(d.contains(e.getPoint())){
//				de.remove(d);
//			}
//		}
		return Init.getInstance();
	}

	public ControllerState mouseDragged(MouseEvent e, StateDiagram de) {
		// TODO Auto-generated method stub
		return this;
	}

	public ControllerState mousePressed(MouseEvent e, StateDiagram de,Caretaker ct) {
		
		System.out.println("TranSourceSelected Mouse Clicked!!!");
		
		for (DiagramElement d : de.getComponent()) {
			
			if(d.contains(e.getPoint())){
				
				de.remove(d);
				//when state diagram add a component the memento would be created
				ct.addMemento(de.CreateMemento()); 
				//version count
				de.addVersion();
				de.addCurrentVersion();
				
			}
			
		}
		return this;
	}

	public ControllerState mouseReleased(MouseEvent e, StateDiagram de, Caretaker ct) {
		
		return this;
	}

}
