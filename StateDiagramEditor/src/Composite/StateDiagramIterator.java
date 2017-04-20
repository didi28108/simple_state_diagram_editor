package Composite;
import java.util.*;

public class StateDiagramIterator implements Iterator {

	private ArrayList<DiagramElement> items;
	private int position = 0;
	
	public StateDiagramIterator(ArrayList<DiagramElement> component) {
		// TODO Auto-generated constructor stub
		
		this.items = component;
		
	}

	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if ( items == null || position >= items.size() || items.get(position) == null)
		{
			return false;
		}
		return true;
	}

	
	public Object next() {
		// TODO Auto-generated method stub
		if ( items != null && position < items.size())
		{
			DiagramElement menuItem = items.get(position++);
			return menuItem.getName();
		}
		return null;
	}
	
	

}
