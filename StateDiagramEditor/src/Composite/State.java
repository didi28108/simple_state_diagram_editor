package Composite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JComponent;


public class State extends JComponent implements DiagramElement{
	
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
		
		System.out.println(" " + preStr + " - " + getName());
	}
	
	
	public void draw(Graphics g){
		
		 g.drawOval(b.x, b.y, b.width, b.height);
		 g.drawString(name, p.x-11, p.y+5);
		 
		 //if the state be selected, display a selection 
		 if (selected) {
             g.setColor(Color.darkGray);
             g.drawRect(b.x, b.y, b.width, b.height);
         }
	}
	
	public boolean intersect(Point p){
		
		return true;	
	}
	
	private void setBoundary(Rectangle b) {
		//set the selection boundary
        b.setBounds(p.x - r, p.y - r, 2 * r, 2 * r);
    }
	
	@Override
	public void updatePosition(Point p)
	{
		this.p.x = p.x;
		this.p.y = p.y;
		this.setBoundary(this.b);
	}
	
	public Point getLocation() {
        return p;
    }
	
	@Override
	public boolean contains(Point p) {
        return b.contains(p);
    }

    /**
     * Return true if this node is selected.
     */
    public boolean isSelected() {
        return selected;
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

	public Iterator createIterator() {
		
		return null;
	}

	public void add(DiagramElement de) {
		
	}
	
	public void remove(DiagramElement de) {
		
			
	}

	public String getName(){
		
		return this.name;
	}

	@Override
	public Object getComponent() {   
		
		return null;
	}
	
	public Rectangle getRect(){
		
		return b;
	}
	
	@Override
	public void setName(String name) {
		this.name=name;
		
	}

}
