package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JPanel;

import Composite.DiagramElement;
import Controller.MouseClickedListener;




public class DrawPanel extends JComponent{

	
	
	public DrawPanel(){
		
		
		this.setLayout(null);
		this.setBounds(150,50,700,500);
		this.setBackground(Color.white);
		
		
		
	}
	
	public void addMouseListener(MouseListener listenForMouse){
		this.addMouseListener(listenForMouse);
	}
	
	
	
	
	

}
