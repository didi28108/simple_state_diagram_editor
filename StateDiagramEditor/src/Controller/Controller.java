package Controller;


import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import Composite.DiagramElement;
import Composite.Iterator;
import Composite.State;
import Composite.StateDiagram;
import Composite.Transition;
import GUI.View;
import StateController.AddState;
import StateController.ControllerState;
import StateController.Init;


public class Controller {
	
	
	private View v;
	private DiagramElement de;
	private ControllerState cs;
	//private Graphics g; 
	
	
	public Controller(View v,ControllerState cs,DiagramElement de){
		
		this.v = v;
		this.cs = cs;
		this.de = de;
		
		this.v.addStateListener(new StateButtonListener(this));
		this.v.addTransListener(new TransButtonListener(this));
		this.v.addMouseClickedListener(new MouseClickedListener(this));
		//this.g = v.getDraw_block().getGraphics();
		 
		//initial state
		
	}
	
	public void selectBtnClicked(){
	    	
	    cs.selectBtnClicked();
	    	
	}

	//stateBtnClicked
	public void stateBtnClicked(ActionEvent e){
		
		System.out.println("state was clicked");
		
		cs = cs.stateBtnClicked();
		
		
	}
	
	//transition button
    public void transBtnClicked(ActionEvent e){
		
    		System.out.println("trans");
    		cs = cs.transBtnClicked();
    	
//    		Graphics g = v.getDraw_block().getGraphics();
//    		DiagramElement co2 = new Transition("com2");
//    	
//    		co2.draw(g);
    	
		
	}
    
	
	public void mouseClicked(MouseEvent e) {
		
		
		Graphics g = v.getDraw_block().getGraphics();
		System.out.println("Controller MouseClicked");
		cs.mouseClicked(e,g,de);
		
	}

	
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Controller mouseDragged");
		cs.mouseDragged(e);
		
	}

	
	public void mousePressed(MouseEvent e) {
		
		cs.mousePressed(e,de);
		
	}

	
	public void mouseReleased(MouseEvent e) {
		
		cs.mouseReleased(e);
		
	}
	
	
	

}
