package Composite;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JComponent;


public class State extends JComponent implements DiagramElement{
	
	private int width;
	private int height;
	private String name;
	private Point p;
	private int r;
	private Rectangle b = new Rectangle();
	private boolean selected = false;
	
	public State(String name,Point p,int r){
		
		this.name = name;
		this.p = p;
		this.r= r;
		
		setBoundary(b);
		
	}
	
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(" " + preStr + " - " + getName());
	}
	
	
	public void draw(Graphics g){
		
		 g.drawOval(b.x, b.y, b.width, b.height);
		 //g.drawOval(200, 200, 50, 50);

	}
	
	public boolean intersect(Point p){
		
		return true;
		
	}
	
	private void setBoundary(Rectangle b) {
        b.setBounds(p.x - r, p.y - r, 2 * r, 2 * r);
    }
	
	public Point getLocation() {
        return p;
    }
	
	public boolean contains(Point p) {
        return b.contains(p);
    }

    /**
     * Return true if this node is selected.
     */
    public boolean isSelected() {
        return selected;
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
