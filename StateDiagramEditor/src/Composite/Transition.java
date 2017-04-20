package Composite;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

public class Transition extends JComponent implements DiagramElement{
	
	private String name;
	private Point dest;
	
	public Transition(String name){
		
		this.name = name;
		
	}
	
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(" " + preStr + " - " + getName());
	}
	
	
	
	public boolean intersect(Point p){
		
		
		return true;
	}



	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(200, 200, 25, 20);
	}




	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return null;
	}


	public void add(DiagramElement de) {
		// TODO Auto-generated method stub
		
	}


	public void remove(DiagramElement de) {
		// TODO Auto-generated method stub
		
	}
	
	
	public String getName(){
		
		
		return this.name;
		
	}

}
