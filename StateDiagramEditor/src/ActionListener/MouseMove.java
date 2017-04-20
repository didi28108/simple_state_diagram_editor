package ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import Controller.Controller;

public class MouseMove implements MouseMotionListener {

	Controller c;
	
	public MouseMove(Controller c)
	{
		this.c = c;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		c.mouseDragged(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
	}

}
