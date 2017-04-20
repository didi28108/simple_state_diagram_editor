package Composite;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JComponent;


public class StateDiagram extends JComponent implements DiagramElement {

	
	
	private ArrayList<DiagramElement> component = null;
	private String name;
	
	public StateDiagram(String name){
		

		this.name = name;
		
		
	}
	
	
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr + " + " + this.getName());
		
		if(this.component != null)
		{
			preStr += " ";
			for (DiagramElement c : component)
			{
				c.printStruct(preStr);
			}
		}
	}
	
	
	public void add(DiagramElement de){
		
		if (component == null)
		{
			component = new ArrayList<DiagramElement>();
		}
		
		component.add(de);
		
	}
	
	
	public void remove(DiagramElement de) {
		// TODO Auto-generated method stub
		
		
	}
	
	
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		Iterator it = this.createIterator();
		while(it.hasNext()){
			
			DiagramElement e = (DiagramElement) it.next();
			e.draw(g);
			
		}
		
		
	}

	
	public boolean intersect(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

	public DiagramElement get(){
		
		return null;
	}

	//factory method for Iterator
	
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new StateDiagramIterator(this.component);
	}
	
	
	public String getName(){
		
		
		return this.name;
		
	}

	
}
