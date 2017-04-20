package Composite;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public abstract interface DiagramElement {
	
	//private String name;
	//private Point loc; 
	
	
	public abstract void draw(Graphics g); 
	public abstract boolean intersect(Point p);
	
	//factory method for create Iterator
	public abstract Iterator createIterator(); 
	
	public abstract void add(DiagramElement de);
	
	public abstract void remove(DiagramElement de);

	public abstract void printStruct(String preStr);
	public abstract String getName();
	
	
	

}
