package Composite;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

public abstract interface DiagramElement {
	
	public abstract void draw(Graphics g); 
	//factory method for create Iterator
	public abstract Iterator createIterator(); 
	public abstract void add(DiagramElement de);
	public abstract void remove(DiagramElement de);
	public abstract void printStruct(String preStr);
	public abstract String getName();
	public abstract void setName(String name);
	//get object from StateDiagram's ArrayList 
	public abstract Object getComponent();
	//this method check the component you clicked
	public abstract boolean contains(Point point);
	public abstract void setSelected(boolean b);
	//update the state's position
	public abstract void updatePosition(Point p);
	public abstract Rectangle getRect();
	public abstract boolean isSelected();
	public abstract Point getLocation();
	//public abstract boolean intersect(Point p);
	
}
