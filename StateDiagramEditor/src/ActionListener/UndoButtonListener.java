package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.Controller;

public class UndoButtonListener implements ActionListener{

	private Controller c;
	
	public UndoButtonListener(Controller c){
		
		this.c = c;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		c.undoBtnClicked(e);
		
	}
	
	

}
