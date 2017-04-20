package ActionListener;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.Controller;
import StateController.ControllerState;

public class StateButtonListener implements ActionListener{

	private Controller c;
	
	public StateButtonListener(Controller c){
		
		this.c = c;
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		c.stateBtnClicked(e);
		
	}

	
}
