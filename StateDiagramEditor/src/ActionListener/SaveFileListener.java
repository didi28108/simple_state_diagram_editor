package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.Controller;

public class SaveFileListener implements ActionListener{
	
private Controller c;
	
	public SaveFileListener(Controller c){
		
		this.c = c;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		c.saveFileBtnClicked();
		
	}
	
}
