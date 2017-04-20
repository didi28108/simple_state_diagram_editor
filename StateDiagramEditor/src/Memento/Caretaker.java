package Memento;

import java.util.ArrayList;

import Composite.DiagramElement;

public class Caretaker {
	
	private ArrayList<StateDiagramMemento> sdmList = new ArrayList<StateDiagramMemento>();
	
	//add memento to ArrayList
	public void addMemento(StateDiagramMemento m){
		
		sdmList.add(m);
		System.out.println("add memento to caretaker");
		System.out.println("caretaker:"+sdmList.size());
		printCaretaker();
		
	} 
	//get the version of memento form caretaker
	public StateDiagramMemento getMemento(int index){
		
		return sdmList.get(index);
	}
	//just print the memento
	public void printCaretaker(){
		
		for(StateDiagramMemento mm:sdmList){
			
			mm.printMemento();
			
		}
	}
	

}
