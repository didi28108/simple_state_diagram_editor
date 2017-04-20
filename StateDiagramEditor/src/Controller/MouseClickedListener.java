package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import StateController.ControllerState;

public class MouseClickedListener implements MouseListener{
	
	private Controller c;
	
	public MouseClickedListener(Controller c){
		
		this.c = c;
		
	}
	



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("MouseClicked");
		c.mouseClicked(e);
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		c.mousePressed(e);
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("MouseReleased");
		c.mouseReleased(e);
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
