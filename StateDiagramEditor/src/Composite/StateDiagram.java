package Composite;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import Memento.StateDiagramMemento;

public class StateDiagram implements DiagramElement, Cloneable {

	private ArrayList<DiagramElement> component = new ArrayList<DiagramElement>();
	private String name;
	private static int version = 0; // it present how many memento version
	private static int currentVersion = 0;// a stop for redo & undo
	private StateDiagram sd;// store the clone

	public StateDiagram(String name) {

		this.name = name;

	}

	public void printStruct(String preStr) {
		// print the structure for state diagram
		System.out.println(preStr + " + " + this.getName());

		if (this.component != null) {
			preStr += " ";
			for (DiagramElement c : component) {
				c.printStruct(preStr);
			}
		}
	}

	public void add(DiagramElement de) {

		this.component.add(de);

	}

	public void remove(DiagramElement component) {
		this.component.remove(component);
	}

	public void draw(Graphics g) {

		// use iterator to traversal the component of state diagram
		Iterator it = this.createIterator();

		while (it.hasNext()) {

			DiagramElement e = (DiagramElement) it.next();
			e.draw(g);

		}
	}

	// public boolean intersect(Point p) {
	//
	// return false;
	// }

	// get the component of state diagram
	public ArrayList<DiagramElement> getComponent() {

		return component;
	}

	// the function which lets StateDiagram set clone Arraylist
	public void setComponent(ArrayList<DiagramElement> deList) {

		this.component = deList;
	}

	// factory method for Iterator
	public Iterator createIterator() {

		return new StateDiagramIterator(this.component);
	}

	public String getName() {

		return this.name;
	}

	@Override
	public boolean contains(Point point) {

		return false;
	}

	@Override
	public void setSelected(boolean b) {

	}

	@Override
	public void updatePosition(Point p) {

	}

	@Override
	public Rectangle getRect() {

		return null;
	}

	@Override
	public boolean isSelected() {

		return false;
	}

	@Override
	public Point getLocation() {

		return null;
	}

	// get the StateDiagram stored in Memento
	public void SetMemento(StateDiagramMemento sdm) {

		component = sdm.getState().getComponent();

	}

	// create a new Memento with a new StateDiagram
	public StateDiagramMemento CreateMemento() {

		System.out.println("store memento");

		// create new StateDiagram to store clone copy
		// create new ArrayList to store clone copy
		StateDiagram sd = new StateDiagram(name);
		ArrayList<DiagramElement> ade = new ArrayList<DiagramElement>();
		ade = (ArrayList<DiagramElement>) this.component.clone(); // clone
		sd.setComponent(ade);
		// new StateDiagram set clone copy

		return new StateDiagramMemento(sd); 
		// create a memento to store clone StateDiagram

	}

	public void addVersion() {

		version += 1;
		System.out.println("version:" + version);
	}

	public int getVersion() {

		return version;

	}

	public void addCurrentVersion() {

		currentVersion += 1;

	}

	public void minusCurrentVersion() {

		currentVersion -= 1;

	}

	public int getCurrentVersion() {

		return currentVersion;

	}

	@Override
	public void setName(String name) {
		

	}

	// add component from open file
	public void addComponent(DiagramElement deList) {

		this.component.add(deList);
	}

	
}
