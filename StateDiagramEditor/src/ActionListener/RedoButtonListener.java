package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.Controller;

public class RedoButtonListener implements ActionListener{

	private Controller c;
	
	public RedoButtonListener(Controller c){
		
		this.c = c;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		c.redoBtnClicked(e);
		
	}

}
