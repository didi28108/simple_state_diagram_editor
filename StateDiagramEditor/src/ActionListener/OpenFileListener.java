package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.Controller;

public class OpenFileListener implements ActionListener{

private Controller c;
	
	public OpenFileListener(Controller c){
		
		this.c = c;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		c.openFileBtnClicked();
		
	}
	
}
